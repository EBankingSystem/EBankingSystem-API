package com.ebs.constant;

public final class SplCharPatterns {
    // Prevent instantiation
    private SplCharPatterns() {}
    // =====================================
    // Regex Patterns
    // =====================================
    public static final String ACCOUNT_NUMBER = "^[0-9]{9,18}$";
    public static final String ADDRESS = "[^a-zA-Z0-9.#,/_\\- \\s]";
    public static final String BRANCH_CODE = "^[a-zA-Z0-9]{6}$";
    public static final String COMPANY_NAME = "[^a-zA-Z0-9&.,#/_\\-@\\s( )]";
    public static final String CONTACT_PHONE_NUMBER = "^[0-9, ]*$";
    public static final String DIGIT_REPEAT = "([0-9])\\1*";
    public static final String AADHAR = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";
    public static final String EMAIL = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    public static final String FAQ_QUESTION = "[^,a-zA-Z0-9&. \\s _ @-]";
    public static final String PINCODE = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
    public static final String GST_NUMBER = "^[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9A-Z]{1}Z[0-9A-Z]{1}$";
    public static final String IFSC_CODE = "^[A-Z|a-z]{4}0[a-zA-Z0-9]{6}$";
    public static final String INSTRUMENT_NUMBER = "[^a-zA-Z0-9]";
    public static final String LIMITED_SPL_CHAR = "[^a-zA-Z.,()0-9\\-/_\\s]";
    public static final String ORG_CHAIN = "[^a-zA-Z0-9./_\\-\\s( )]";
    public static final String PAN_NUMBER = "^[A-Z]{5}[0-9]{4}[A-Z]$";
    public static final String TAN_NUMBER = "[A-Z]{4}[0-9]{5}[A-Z]";
    public static final String PASSWORD_COMPLEXITY = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!,@,#,$,^,*,_,~]).{8,32}";
    public static final String RATIO = "[^a-zA-Z0-9.:,#/_\\-@\\s( )]";
    public static final String SERVLET_ACCESS = "[-a-zA-Z0-9\\s*=\\s*-+&@#$/?=\\[|\\]~_()'|!:,.;*]*[-a-zA-Z0-9\\s*=\\s*-+&@$?#/=\\[|\\]()'~_|*]";
    public static final String SPACE_EXISTS = "(?=.*\\s)";
    public static final String URL = "^https?://[a-zA-Z0-9_/\\-\\.]+\\.([A-Za-z/]{2,5})[a-zA-Z0-9_/\\&\\?\\=\\-\\.\\~\\%]*";
    public static final String GENERAL = "[^a-zA-Z0-9.,#/_\\-@\\s( )]";
    public static final String MOBILE_PATTERN="^\\d{10}$";

    public static final int MIN_PASSWORD_LENGTH = 6;
    public static final int MAX_PASSWORD_LENGTH = 12;
}
