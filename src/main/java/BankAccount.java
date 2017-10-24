/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * Enum array of different types of bankAccounts.
     */
    public enum BankAccountType {
        /** checking account. */
        CHECKINGS,
        /** saving account. */
        SAVINGS,
        /** student account. */
        STUDENT,
        /** work account. */
        WORKPLACE
    }

    /** number of account. */
    private int accountNumber;

    /** type of account. */
    private BankAccountType accountType;

    /** balance of account. */
    private double accountBalance;

    /** owner of account. */
    private String ownerName;

    /** interest rate of account. */
    private double interestRate;

    /** interest earned of account. */
    private double interestEarned;

    /**
     * Constructs a BankAccount.
     *
     * @param name the name of the owner
     * @param accountCategory the type of account
     *
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        interestEarned = 0.0;
        interestRate = 0.0;
        accountNumber = Bank.totalAccounts + 1;
        Bank.totalAccounts++;
    }

    /**
     * Returns accountNumber.
     * @return account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets accountNumber.
     * @return account type
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * Returns interestRate.
     * @return interest rate.
     */

    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Sets accountNumber.
     * @param accNumber the number of account
     */
    public void setAccountNumber(final int accNumber) {
        accountNumber = accNumber;
    }

    /**
     * Returns accountBalance.
     * @return balance of account.
     */

    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets accountBalance.
     * @param accBalance the balance of account
     */
    public void setAccountBalance(final double accBalance) {
        accountBalance = accBalance;
    }

    /**
     * Returns ownerName.
     * @return owner name.
     */

    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets ownerName.
     * @param ownName the name of owner
     */
    public void setOwnerName(final String ownName) {
        ownerName = ownName;
    }

    /**
     * Returns interestEarned.
     * @return interest earned.
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     * Sets interestEarned.
     * @param intEarned the interest earned
     */

    public void setInterestEarned(final double intEarned) {
        interestEarned = intEarned;
    }
}