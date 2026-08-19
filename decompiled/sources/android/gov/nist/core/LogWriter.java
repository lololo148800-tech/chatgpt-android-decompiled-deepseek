package android.gov.nist.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;
import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.apache.log4j.SimpleLayout;

/* JADX INFO: loaded from: classes.dex */
public class LogWriter implements StackLogger {
    private String buildTimeStamp;
    private Properties configurationProperties;
    private int lineCount;
    private Logger logger;
    private String stackName;
    private String logFileName = null;
    private volatile boolean needsLogging = false;
    protected int traceLevel = 0;

    private void countLines(String str) {
        for (char c9 : str.toCharArray()) {
            if (c9 == '\n') {
                this.lineCount++;
            }
        }
    }

    private String enhanceMessage(String str) {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[3];
        return stackTraceElement.getClassName() + Separators.DOT + stackTraceElement.getMethodName() + Separators.LPAREN + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") [" + str + "]";
    }

    private void setTraceLevel(int i10) {
        this.traceLevel = i10;
    }

    public void addAppender(Appender appender) {
        this.logger.addAppender(appender);
    }

    @Override // android.gov.nist.core.StackLogger
    public void disableLogging() {
        this.needsLogging = false;
    }

    @Override // android.gov.nist.core.StackLogger
    public void enableLogging() {
        this.needsLogging = true;
    }

    public Level getLevel(int i10) {
        if (i10 == 16) {
            return Level.INFO;
        }
        if (i10 == 4) {
            return Level.ERROR;
        }
        if (i10 == 32) {
            return Level.DEBUG;
        }
        return i10 == 64 ? Level.ALL : Level.OFF;
    }

    @Override // android.gov.nist.core.StackLogger
    public int getLineCount() {
        return this.lineCount;
    }

    public Priority getLogPriority() {
        int i10 = this.traceLevel;
        if (i10 == 16) {
            return Priority.INFO;
        }
        if (i10 == 4) {
            return Priority.ERROR;
        }
        if (i10 == 32) {
            return Priority.DEBUG;
        }
        return i10 == 64 ? Priority.DEBUG : Priority.FATAL;
    }

    public Logger getLogger() {
        return this.logger;
    }

    @Override // android.gov.nist.core.StackLogger
    public String getLoggerName() {
        Logger logger = this.logger;
        if (logger != null) {
            return logger.getName();
        }
        return null;
    }

    public int getTraceLevel() {
        return this.traceLevel;
    }

    @Override // android.gov.nist.core.StackLogger
    public boolean isLoggingEnabled() {
        return this.needsLogging;
    }

    @Override // android.gov.nist.core.StackLogger
    public void logDebug(String str) {
        if (this.needsLogging) {
            String strEnhanceMessage = enhanceMessage(str);
            if (this.lineCount == 0) {
                getLogger().debug("BUILD TIMESTAMP = " + this.buildTimeStamp);
                getLogger().debug("Config Propeties = " + this.configurationProperties);
            }
            countLines(strEnhanceMessage);
            getLogger().debug(strEnhanceMessage);
        }
    }

    @Override // android.gov.nist.core.StackLogger
    public void logError(String str) {
        Logger logger = getLogger();
        String strEnhanceMessage = enhanceMessage(str);
        countLines(strEnhanceMessage);
        logger.error(strEnhanceMessage);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logException(Throwable th2) {
        if (this.needsLogging) {
            getLogger().error(th2.getMessage(), th2);
        }
    }

    @Override // android.gov.nist.core.StackLogger
    public void logFatalError(String str) {
        Logger logger = getLogger();
        String strEnhanceMessage = enhanceMessage(str);
        countLines(strEnhanceMessage);
        logger.fatal(strEnhanceMessage);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logInfo(String str) {
        getLogger().info(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logStackTrace() {
        logStackTrace(32);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logTrace(String str) {
        if (this.needsLogging) {
            String strEnhanceMessage = enhanceMessage(str);
            if (this.lineCount == 0) {
                getLogger().debug("BUILD TIMESTAMP = " + this.buildTimeStamp);
                getLogger().debug("Config Propeties = " + this.configurationProperties);
            }
            countLines(strEnhanceMessage);
            getLogger().trace(strEnhanceMessage);
        }
    }

    @Override // android.gov.nist.core.StackLogger
    public void logWarning(String str) {
        getLogger().warn(str);
    }

    @Override // android.gov.nist.core.StackLogger
    public void setBuildTimeStamp(String str) {
        this.buildTimeStamp = str;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008f A[Catch: NumberFormatException -> 0x0048, TryCatch #1 {NumberFormatException -> 0x0048, blocks: (B:7:0x0033, B:9:0x0041, B:31:0x0086, B:33:0x008f, B:40:0x00b6, B:42:0x00ba, B:44:0x00be, B:46:0x00cd, B:56:0x0106, B:49:0x00dd, B:50:0x00e1, B:51:0x00f2, B:54:0x0101, B:35:0x0099, B:37:0x00a3, B:39:0x00ad, B:13:0x004b, B:16:0x0054, B:19:0x005e, B:22:0x0068, B:24:0x0070, B:27:0x0079, B:29:0x007f), top: B:61:0x0033, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0099 A[Catch: NumberFormatException -> 0x0048, TryCatch #1 {NumberFormatException -> 0x0048, blocks: (B:7:0x0033, B:9:0x0041, B:31:0x0086, B:33:0x008f, B:40:0x00b6, B:42:0x00ba, B:44:0x00be, B:46:0x00cd, B:56:0x0106, B:49:0x00dd, B:50:0x00e1, B:51:0x00f2, B:54:0x0101, B:35:0x0099, B:37:0x00a3, B:39:0x00ad, B:13:0x004b, B:16:0x0054, B:19:0x005e, B:22:0x0068, B:24:0x0070, B:27:0x0079, B:29:0x007f), top: B:61:0x0033, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3 A[Catch: NumberFormatException -> 0x0048, TryCatch #1 {NumberFormatException -> 0x0048, blocks: (B:7:0x0033, B:9:0x0041, B:31:0x0086, B:33:0x008f, B:40:0x00b6, B:42:0x00ba, B:44:0x00be, B:46:0x00cd, B:56:0x0106, B:49:0x00dd, B:50:0x00e1, B:51:0x00f2, B:54:0x0101, B:35:0x0099, B:37:0x00a3, B:39:0x00ad, B:13:0x004b, B:16:0x0054, B:19:0x005e, B:22:0x0068, B:24:0x0070, B:27:0x0079, B:29:0x007f), top: B:61:0x0033, inners: #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad A[Catch: NumberFormatException -> 0x0048, TryCatch #1 {NumberFormatException -> 0x0048, blocks: (B:7:0x0033, B:9:0x0041, B:31:0x0086, B:33:0x008f, B:40:0x00b6, B:42:0x00ba, B:44:0x00be, B:46:0x00cd, B:56:0x0106, B:49:0x00dd, B:50:0x00e1, B:51:0x00f2, B:54:0x0101, B:35:0x0099, B:37:0x00a3, B:39:0x00ad, B:13:0x004b, B:16:0x0054, B:19:0x005e, B:22:0x0068, B:24:0x0070, B:27:0x0079, B:29:0x007f), top: B:61:0x0033, inners: #2, #4 }] */
    @Override // android.gov.nist.core.StackLogger
    public void setStackProperties(Properties properties) {
        int i10;
        int i11;
        this.configurationProperties = properties;
        String property = properties.getProperty("android.gov.nist.javax.sip.TRACE_LEVEL");
        this.logFileName = properties.getProperty("android.gov.nist.javax.sip.DEBUG_LOG");
        String property2 = properties.getProperty("android.javax.sip.STACK_NAME");
        this.stackName = property2;
        this.logger = Logger.getLogger(properties.getProperty("android.gov.nist.javax.sip.LOG4J_LOGGER_NAME", property2));
        if (property == null) {
            this.needsLogging = false;
            return;
        }
        if (property.equals("LOG4J")) {
            CommonLogger.useLegacyLogger = false;
            return;
        }
        try {
            if (!property.equals("TRACE")) {
                if (!property.equals("DEBUG")) {
                    if (property.equals("INFO")) {
                        i10 = 16;
                    } else if (property.equals("ERROR")) {
                        i10 = 4;
                    } else if (property.equals("NONE") || property.equals("OFF")) {
                        i10 = 0;
                    } else {
                        i10 = Integer.parseInt(property);
                        if (i10 > 32) {
                            Debug.debug = true;
                            Debug.setStackLogger(this);
                        }
                    }
                }
                setTraceLevel(i10);
                this.needsLogging = true;
                i11 = this.traceLevel;
                if (i11 == 32) {
                    this.logger.setLevel(Level.DEBUG);
                } else if (i11 == 16) {
                    this.logger.setLevel(Level.INFO);
                } else if (i11 == 4) {
                    this.logger.setLevel(Level.ERROR);
                } else if (i11 == 0) {
                    this.logger.setLevel(Level.OFF);
                    this.needsLogging = false;
                }
                if (this.needsLogging || this.logFileName == null) {
                }
                Appender fileAppender = null;
                try {
                    fileAppender = new FileAppender(new SimpleLayout(), this.logFileName, !Boolean.valueOf(properties.getProperty("android.gov.nist.javax.sip.DEBUG_LOG_OVERWRITE")).booleanValue());
                } catch (FileNotFoundException unused) {
                    File file = new File(this.logFileName);
                    file.getParentFile().mkdirs();
                    file.delete();
                    try {
                        fileAppender = new FileAppender(new SimpleLayout(), this.logFileName);
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
                if (fileAppender != null) {
                    this.logger.addAppender(fileAppender);
                    return;
                }
                return;
            }
            Debug.debug = true;
            Debug.setStackLogger(this);
            i10 = 32;
            setTraceLevel(i10);
            this.needsLogging = true;
            i11 = this.traceLevel;
            if (i11 == 32) {
                this.logger.setLevel(Level.DEBUG);
            } else if (i11 == 16) {
                this.logger.setLevel(Level.INFO);
            } else if (i11 == 4) {
                this.logger.setLevel(Level.ERROR);
            } else if (i11 == 0) {
                this.logger.setLevel(Level.OFF);
                this.needsLogging = false;
            }
            if (this.needsLogging) {
            }
        } catch (NumberFormatException e12) {
            e12.printStackTrace();
            PrintStream printStream = System.err;
            printStream.println("LogWriter: Bad integer ".concat(property));
            printStream.println("logging dislabled ");
            this.needsLogging = false;
        }
    }

    @Override // android.gov.nist.core.StackLogger
    public boolean isLoggingEnabled(int i10) {
        return this.needsLogging && i10 <= this.traceLevel;
    }

    @Override // android.gov.nist.core.StackLogger
    public void logStackTrace(int i10) {
        if (this.needsLogging) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            for (int i11 = 1; i11 < stackTrace.length; i11++) {
                printWriter.print("[" + stackTrace[i11].getFileName() + ":" + stackTrace[i11].getLineNumber() + "]");
            }
            printWriter.close();
            String string = stringWriter.getBuffer().toString();
            Level level = getLevel(i10);
            if (level.isGreaterOrEqual(getLogPriority())) {
                this.logger.log(level, string);
            }
        }
    }

    @Override // android.gov.nist.core.StackLogger
    public void logError(String str, Exception exc) {
        getLogger().error(str, exc);
    }

    @Override // android.gov.nist.core.StackLogger
    public void logDebug(String str, Exception exc) {
        if (this.needsLogging) {
            String strEnhanceMessage = enhanceMessage(str);
            if (this.lineCount == 0) {
                getLogger().debug("BUILD TIMESTAMP = " + this.buildTimeStamp);
                getLogger().debug("Config Propeties = " + this.configurationProperties);
            }
            countLines(strEnhanceMessage);
            getLogger().debug(strEnhanceMessage, exc);
        }
    }
}
