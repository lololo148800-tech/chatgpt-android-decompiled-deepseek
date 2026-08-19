package p592Y7;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p437Rn.C6949g;
import p523V9.AbstractC7889G0;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p765g7.InterfaceC13823a;
import p804i8.C14944c;

/* JADX INFO: renamed from: Y7.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9667b {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f29147a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public static final InterfaceC9670e m10254a(InterfaceC13823a sdkCore) {
        InterfaceC9670e c14944c;
        InterfaceC11256c interfaceC11256cMo15463s;
        AbstractC16544l.m18094g(sdkCore, "sdkCore");
        LinkedHashMap linkedHashMap = f29147a;
        synchronized (linkedHashMap) {
            try {
                c14944c = (InterfaceC9670e) linkedHashMap.get(sdkCore);
                if (c14944c == null) {
                    InterfaceC13823a interfaceC13823a = sdkCore instanceof InterfaceC13823a ? sdkCore : null;
                    if (interfaceC13823a != null && (interfaceC11256cMo15463s = interfaceC13823a.mo15463s()) != null) {
                        AbstractC7889G0.m8184b(interfaceC11256cMo15463s, 4, EnumC11255b.f34098Y, new C6949g(sdkCore, 16), null, false, 56);
                    }
                    c14944c = new C14944c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c14944c;
    }
}
