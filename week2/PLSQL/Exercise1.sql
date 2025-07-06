-- Scenario 1: Apply 1% Discount
DECLARE
    CURSOR customer_cursor IS
        SELECT CustomerID, InterestRate
        FROM Customers
        WHERE Age > 60;
BEGIN
    FOR cust IN customer_cursor LOOP
        UPDATE Customers
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = cust.CustomerID;
    END LOOP;
    COMMIT;
END;
/


-- Scenario 2: Promote to VIP
BEGIN
    FOR cust IN (SELECT CustomerID, Balance FROM Customers) LOOP
        IF cust.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cust.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;
/


-- Scenario 3: Loan Reminders
DECLARE
    CURSOR loan_cursor IS
        SELECT LoanID, CustomerID, DueDate
        FROM Loans
        WHERE DueDate <= SYSDATE + 30;

    v_name VARCHAR2(100);
BEGIN
    FOR loan IN loan_cursor LOOP
        SELECT Name INTO v_name
        FROM Customers
        WHERE CustomerID = loan.CustomerID;

        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || loan.LoanID ||
                             ' for customer ' || v_name ||
                             ' is due on ' || TO_CHAR(loan.DueDate, 'DD-MON-YYYY'));
    END LOOP;
END;
/
