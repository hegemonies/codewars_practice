package HRDF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TimeFormatter {
    static int seconds = 0;
    static int minutes = 0;
    static int hours = 0;
    static int days = 0;
    static int years = 0;

    enum TypeTimeUnit {
        SECONDS, MINUTES, HOURS, DAYS, YEARS
    }

    public static String formatDuration(int localSeconds) {
        if (localSeconds == 0) {
            return "now";
        }

        while (localSeconds > 59) {
            minutes++;
            localSeconds -= 60;

            if (minutes > 59) {
                hours++;
                minutes -= 60;
            }

            if (hours > 23) {
                days++;
                hours -= 24;
            }

            if (days > 365) {
                years++;
                days -= 365;
            }
        }

        seconds = localSeconds;

        System.out.println(_toString());

        String result = _toString();
        toZeroAll();

        return result;
    }

    private static void toZeroAll() {
        seconds = 0;
        minutes = 0;
        hours = 0;
        days = 0;
        years = 0;
    }

    public static String _toString() {
        StringBuilder sb = new StringBuilder();

        List<TypeTimeUnit> nonzero = new ArrayList<TypeTimeUnit>();

        if (seconds != 0) {
            nonzero.add(TypeTimeUnit.SECONDS);
        }
        if (minutes != 0) {
            nonzero.add(TypeTimeUnit.MINUTES);
        }
        if (hours != 0) {
            nonzero.add(TypeTimeUnit.HOURS);
        }
        if (days != 0) {
            nonzero.add(TypeTimeUnit.DAYS);
        }
        if (years != 0) {
            nonzero.add(TypeTimeUnit.YEARS);
        }

        if (nonzero.size() == 2) {
            sb.append(getAnyString(nonzero.get(1)));
            sb.append(" and ");
            sb.append(getAnyString(nonzero.get(0)));
        } else if (nonzero.size() > 2) {
            Collections.reverse(nonzero);
            for (TypeTimeUnit type : nonzero) {
                sb.append(getAnyString(type));

                if ((nonzero.indexOf(type) + 1) == nonzero.size()) {
                    continue;
                } else if ((nonzero.indexOf(type) + 2) != nonzero.size()) {
                    sb.append(", ");
                } else {
                    sb.append(" and ");
                }
            }
        } else if (nonzero.size() == 1) {
            sb.append(getAnyString(nonzero.get(0)));
        }

        return sb.toString();
    }

    static String getAnyString(TypeTimeUnit type) {
        if (type == TypeTimeUnit.SECONDS) {
            return getSecondsToString();
        } else if (type == TypeTimeUnit.MINUTES) {
            return getMinutesToString();
        } else if (type == TypeTimeUnit.HOURS) {
            return getHoursToString();
        } else if (type == TypeTimeUnit.DAYS) {
            return getDaysToString();
        }

        return getYearsToString();
    }

    static String getYearsToString() {
        if (years == 1) {
            return years + " year";
        } else {
            return years + " years";
        }
    }

    static String getDaysToString() {
        if (days == 1) {
            return days + " day";
        } else {
            return days + " days";
        }
    }

    static String getHoursToString() {
        if (hours == 1) {
            return hours + " hour";
        } else {
            return hours + " hours";
        }
    }

    static String getMinutesToString() {
        if (minutes == 1) {
            return minutes + " minute";
        } else {
            return minutes + " minutes";
        }
    }

    static String getSecondsToString() {
        if (seconds == 1) {
            return seconds + " second";
        } else {
            return seconds + " seconds";
        }
    }
}