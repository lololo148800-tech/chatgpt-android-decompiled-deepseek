package p951pp;

import java.io.PrintStream;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: pp.e */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC18535e {

    /* JADX INFO: renamed from: a */
    public static final int f59052a;

    /* JADX INFO: renamed from: b */
    public static final int f59053b;

    static {
        int i10;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        int i11 = 2;
        if (property != null && !property.isEmpty()) {
            int i12 = 0;
            while (true) {
                if (i12 >= 3) {
                    i10 = 1;
                    break;
                } else {
                    if (strArr[i12].equalsIgnoreCase(property)) {
                        i10 = 2;
                        break;
                    }
                    i12++;
                }
            }
        } else {
            i10 = 1;
            break;
        }
        f59052a = i10;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("DEBUG")) {
                i11 = 1;
            } else if (property2.equalsIgnoreCase("ERROR")) {
                i11 = 4;
            } else if (property2.equalsIgnoreCase("WARN")) {
                i11 = 3;
            }
        }
        f59053b = i11;
    }

    /* JADX INFO: renamed from: a */
    public static final void m19899a(String str) {
        m19901c().println("SLF4J(E): " + str);
    }

    /* JADX INFO: renamed from: b */
    public static final void m19900b(String str, Throwable th2) {
        m19901c().println("SLF4J(E): " + str);
        m19901c().println("SLF4J(E): Reported exception:");
        th2.printStackTrace(m19901c());
    }

    /* JADX INFO: renamed from: c */
    public static PrintStream m19901c() {
        return AbstractC0010F.m24h(f59052a) != 1 ? System.err : System.out;
    }

    /* JADX INFO: renamed from: d */
    public static final void m19902d(String str) {
        if (AbstractC0010F.m24h(3) >= AbstractC0010F.m24h(f59053b)) {
            m19901c().println("SLF4J(W): " + str);
        }
    }
}
