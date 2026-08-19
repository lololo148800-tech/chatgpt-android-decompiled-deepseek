package p571X9;

import kotlin.jvm.internal.AbstractC16544l;
import mo.EnumC17331H;

/* JADX INFO: renamed from: X9.H2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9141H2 {

    /* JADX INFO: renamed from: a */
    public static boolean f27918a;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static EnumC17331H m9686a(String javaName) {
        AbstractC16544l.m18094g(javaName, "javaName");
        int iHashCode = javaName.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return EnumC17331H.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return EnumC17331H.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return EnumC17331H.TLS_1_3;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return EnumC17331H.TLS_1_0;
            }
        } else if (javaName.equals("SSLv3")) {
            return EnumC17331H.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
    }
}
