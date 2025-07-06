


-- Scenario 1: Process Monthly Interest for Savings Accounts

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'SAVINGS';

    COMMIT;
END;
/


-- Scenario 2: Update Employee Bonus by Department

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_DepartmentID IN NUMBER,
    p_BonusPercent IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_BonusPercent / 100)
    WHERE DepartmentID = p_DepartmentID;

    COMMIT;
END;
/



-- Scenario 3: Transfer Funds Between Accounts

CREATE OR REPLACE PROCEDURE TransferFunds(
    p_SourceAccountID IN NUMBER,
    p_TargetAccountID IN NUMBER,
    p_Amount          IN NUMBER
) AS
    v_SourceBalance NUMBER;
BEGIN

    SELECT Balance INTO v_SourceBalance
    FROM Accounts
    WHERE AccountID = p_SourceAccountID;


    IF v_SourceBalance < p_Amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
    END IF;


    UPDATE Accounts
    SET Balance = Balance - p_Amount
    WHERE AccountID = p_SourceAccountID;


    UPDATE Accounts
    SET Balance = Balance + p_Amount
    WHERE AccountID = p_TargetAccountID;

    COMMIT;
END;
/

