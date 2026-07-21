package com.ebs.constant;

public final class MessageConstants {
    // Prevent instantiation
    private MessageConstants() {}

    // ===== Success Messages =====
    public static final String RESET_PASSWORD_SUCCESSFULLY = "New password has been sent to your registered email ID.";
    public static final String FETCH_SUCCESSFULLY = "Data fetched successfully.";
    public static final String CREATED_SUCCESSFULLY = "%s created successfully.";
    public static final String SAVED_SUCCESSFULLY = "%s saved successfully.";
    public static final String UPDATED_SUCCESSFULLY = "%s updated successfully.";
    public static final String DELETED_SUCCESSFULLY = "%s deleted successfully.";
    public static final String LOGIN_SUCCESSFULLY = "%s logged in successfully.";
    public static final String LOGOUT_SUCCESSFULLY = "%s logged out successfully.";
    public static final String LOGOUT_ALL_DEVICES_SUCCESSFULLY = "%s logged out from all devices successfully.";
    public static final String RESTORE_SUCCESSFULLY = "%s restored successfully.";
    public static final String DOWNLOAD_SUCCESSFULLY = "%s downloaded successfully.";
    public static final String PASSWORD_CHANGED_SUCCESSFULLY = "%s password changed successfully.";

    // ===== Error Messages =====
    public static final String PLAN_ALREADY_ACTIVATED = "Plan is already activated. Please check your profile page.";
    public static final String DELETE_FAILED = "Failed to delete %s. Please contact support.";
    public static final String RESTORE_FAILED = "Failed to restore %s. Please contact support.";
    public static final String FILE_STORE_FAILED = "Failed to store file: %s.";
    public static final String OLD_PASSWORD_INVALID = "The old password provided is incorrect.";
    public static final String PASSWORD_CHANGE_FAILED = "Failed to change password for %s. Please contact support.";
    public static final String LOGOUT_FAILED = "Failed to logout %s. Please contact support.";
    public static final String LOGOUT_ALL_DEVICES_FAILED = "Failed to logout %s from all devices. Please contact support.";
    public static final String ACCOUNT_LOCKED = "Your account is locked. You can try again after %s or reset your password.";
    public static final String INVALID_CREDENTIALS = "Invalid email or password for %s.";
    public static final String INVALID_AUTHORIZATION = "%s is not authorized.";
    public static final String ALREADY_LOGGED_IN = "%s is already logged in on another device. Please logout from the old device and try again.";
    public static final String TURN_ON_NOTIFICATION = "Please turn on notifications from your app settings for %s.";
    public static final String EXCEPTION = "An error occurred: %s";

    // ===== Not Found / Empty =====
    public static final String NO_PLAN_FOUND = "No plan exists.";
    public static final String NO_ACTION_FOUND = "No action exists.";
    public static final String NO_SHARE_FOUND = "No share exists.";
    public static final String NO_PAYMENT_MODE_FOUND = "No payment mode exists.";
    public static final String NO_QR_CODE_FOUND = "No QR code exists.";
    public static final String NO_USER_FOUND = "No user exists.";
    public static final String NO_FILE_SELECTED = "No file selected.";
    public static final String NO_DIRECTORY_FOUND = "Directory not found.";
    public static final String NO_MANUAL_TRANSACTION = "No transaction details found.";
    public static final String NO_RECORDS_FOUND = "No {0} records found.";


    // ===== Validation / Uniqueness =====
    public static final String PLAN_NAME_EXISTS = "The plan name '%s' already exists.";
    public static final String ALREADY_EXISTS = "%s already exists.";
    public static final String NOT_EXISTS = "The given %s does not exist.";

    // ===== Mail / Communication =====
    public static final String MAIL_FAILED = "Please check your email ID or contact: stockviewpointsvp@gmail.com for password reset.";
    public static final String GENERIC_ERROR = "An unexpected error occurred. Please mail your issue to: stockviewpointsvp@gmail.com.";

    // ===== Security / Auth =====
    public static final String AUTHENTICATION_FAILED = "User Authentication Failed";
    public static final String INVALID_CREDENTIAL_ATTEMPT = "Invalid email or password. You have %s attempt(s) left before your account gets locked.";
    public static final String USER_ACCOUNT_DELETE_REQUEST = "User account deletion request registered successfully. It will be processed within 7 working days.";
}
