package HRDF;

public class TimeFormatter {
    static int seconds = 0;
    static int minutes = 0;
    static int hours = 0;
    static int days = 0;
    static int years = 0;

    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }

        System.out.println(_toString());
        return _toString();
    }

    public static String _toString() {
        StringBuilder sb = new StringBuilder();

        int countNonZero = 0;

        if (seconds != 0) {
            countNonZero++;
        }
        if (minutes != 0) {
            countNonZero++;
        }
        if (hours != 0) {
            countNonZero++;
        }
        if (days != 0) {
            countNonZero++;
        }
        if (years != 0) {
            countNonZero++;
        }

        if (countNonZero == 2) {
            if (years != 0) {

            }
            if (days != 0) {
                if (days == 1) {
                    sb.append(", " + Integer.toString(days) + " day");
                } else {
                    sb.append(", " + Integer.toString(days) + " days");
                }
            }
            if (hours != 0) {
                if (hours == 1) {
                    sb.append(", " + Integer.toString(hours) + " hour");
                } else {
                    sb.append(", " + Integer.toString(hours) + " hours");
                }
            }
            if (minutes != 0) {
                if (minutes == 1) {
                    sb.append(", " + Integer.toString(minutes) + " minute");
                } else {
                    sb.append(", " + Integer.toString(minutes) + " minutes");
                }
            }
            if (seconds != 0) {
                if (seconds == 1) {
                    sb.append(", " + Integer.toString(seconds) + " second");
                } else {
                    sb.append(", " + Integer.toString(seconds) + " seconds");
                }
            }
        } else if (countNonZero > 2) {
            if (years != 0) {
                if (years == 1) {
                    sb.append(Integer.toString(years) + " year");
                } else {
                    sb.append(Integer.toString(years) + " years");
                }
            }

            if (days != 0) {
                if (days == 1) {
                    sb.append(", " + Integer.toString(days) + " day");
                } else {
                    sb.append(", " + Integer.toString(days) + " days");
                }
            }

            if (hours != 0) {
                if (hours == 1) {
                    sb.append(", " + Integer.toString(hours) + " hour");
                } else {
                    sb.append(", " + Integer.toString(hours) + " hours");
                }
            }

            if (minutes != 0) {
                if (minutes == 1) {
                    sb.append(", " + Integer.toString(minutes) + " minute");
                } else {
                    sb.append(", " + Integer.toString(minutes) + " minutes");
                }
            }

            if (seconds != 0) {
                if (seconds == 1) {
                    sb.append(", " + Integer.toString(seconds) + " second");
                } else {
                    sb.append(", " + Integer.toString(seconds) + " seconds");
                }
            }
        } else if (countNonZero == 1) {

        }

        return sb.toString();
    }

    static String getYearsToString() {
        if (years == 1) {
            return Integer.toString(years) + " year";
        } else {
            return Integer.toString(years) + " years";
        }
    }
}

// todo: refactor this shit