package p641a7;

import java.util.LinkedHashMap;
import p087D7.AbstractC1977d;
import p523V9.AbstractC7889G0;
import p547Wc.C8816z;
import p658b5.C11248s;
import p661b7.EnumC11255b;
import p765g7.InterfaceC13823a;
import p849k7.C16359l;
import p849k7.C16361n;

/* JADX INFO: renamed from: a7.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10516b {

    /* JADX INFO: renamed from: a */
    public static final C11248s f31164a = new C11248s(AbstractC1977d.f5849a);

    /* JADX INFO: renamed from: b */
    public static final C16361n f31165b = new C16361n();

    /* JADX INFO: renamed from: c */
    public static int f31166c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public static final InterfaceC13823a m10971a(String str) {
        InterfaceC13823a interfaceC13823a;
        C11248s c11248s = f31164a;
        synchronized (c11248s) {
            if (str == null) {
                str = "_dd.sdk_core.default";
            }
            try {
                interfaceC13823a = (InterfaceC13823a) ((LinkedHashMap) c11248s.f34082o0).get(str);
                if (interfaceC13823a == null) {
                    AbstractC7889G0.m8184b(AbstractC1977d.f5849a, 4, EnumC11255b.f34098Y, new C8816z(str, 10, new Throwable().fillInStackTrace()), null, false, 56);
                    interfaceC13823a = C16359l.f50805a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC13823a;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m10972b() {
        boolean z6;
        C11248s c11248s = f31164a;
        synchronized (c11248s) {
            z6 = ((InterfaceC13823a) ((LinkedHashMap) c11248s.f34082o0).get("_dd.sdk_core.default")) != null;
        }
        return z6;
    }
}
