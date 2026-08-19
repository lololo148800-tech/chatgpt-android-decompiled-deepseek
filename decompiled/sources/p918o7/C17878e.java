package p918o7;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p236J7.C4279c;
import p236J7.C4280d;
import p236J7.C4282f;
import p658b5.C11234e;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p765g7.InterfaceC13823a;
import p775h2.AbstractC14376f;
import p849k7.C16360m;

/* JADX INFO: renamed from: o7.e */
/* JADX INFO: loaded from: classes.dex */
public final class C17878e implements InterfaceC11256c {

    /* JADX INFO: renamed from: b */
    public final InterfaceC13823a f56977b;

    /* JADX INFO: renamed from: c */
    public final C17874a f56978c;

    /* JADX INFO: renamed from: d */
    public final C17874a f56979d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f56980e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f56981f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashSet f56982g;

    public C17878e(InterfaceC13823a interfaceC13823a) {
        C17876c c17876c = C17876c.f56975Y;
        this.f56977b = interfaceC13823a;
        this.f56978c = (C17874a) c17876c.invoke();
        this.f56979d = null;
        this.f56980e = new LinkedHashSet();
        this.f56981f = new LinkedHashSet();
        this.f56982g = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: e */
    public static int m19601e(int i10) {
        int iM24h = AbstractC0010F.m24h(i10);
        if (iM24h == 0) {
            return 2;
        }
        if (iM24h == 1) {
            return 3;
        }
        if (iM24h == 2) {
            return 4;
        }
        if (iM24h == 3) {
            return 5;
        }
        if (iM24h == 4) {
            return 6;
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: a */
    public final void m19602a(int i10, EnumC11255b target, InterfaceC1426a messageBuilder, Throwable th2, boolean z6, Map map) {
        InterfaceC13823a interfaceC13823a;
        C16360m c16360mMo15458n;
        Object c4280d;
        AbstractC14376f.m15825D(i10, "level");
        AbstractC16544l.m18094g(target, "target");
        AbstractC16544l.m18094g(messageBuilder, "messageBuilder");
        int iOrdinal = target.ordinal();
        if (iOrdinal == 0) {
            m19605d(this.f56978c, i10, messageBuilder, th2, z6, this.f56980e);
            return;
        }
        if (iOrdinal == 1) {
            C17874a c17874a = this.f56979d;
            if (c17874a != null) {
                m19605d(c17874a, i10, messageBuilder, th2, z6, this.f56981f);
                return;
            }
            return;
        }
        if (iOrdinal != 2 || (interfaceC13823a = this.f56977b) == null || (c16360mMo15458n = interfaceC13823a.mo15458n("rum")) == null) {
            return;
        }
        String message = (String) messageBuilder.invoke();
        if (z6) {
            LinkedHashSet linkedHashSet = this.f56982g;
            if (linkedHashSet.contains(message)) {
                return;
            } else {
                linkedHashSet.add(message);
            }
        }
        if (i10 == 5 || i10 == 4 || th2 != null) {
            c4280d = new C4280d(message, map);
        } else {
            AbstractC16544l.m18094g(message, "message");
            c4280d = new C4279c(message, map);
        }
        c16360mMo15458n.m17960a(c4280d);
    }

    /* JADX INFO: renamed from: b */
    public final void m19603b(int i10, List list, InterfaceC1426a messageBuilder, Throwable th2, boolean z6, Map map) {
        AbstractC14376f.m15825D(i10, "level");
        AbstractC16544l.m18094g(messageBuilder, "messageBuilder");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m19602a(i10, (EnumC11255b) it.next(), messageBuilder, th2, z6, map);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19604c(InterfaceC1426a interfaceC1426a, Map map, float f10) {
        InterfaceC13823a interfaceC13823a;
        C16360m c16360mMo15458n;
        if (!new C11234e(f10).m12504H() || (interfaceC13823a = this.f56977b) == null || (c16360mMo15458n = interfaceC13823a.mo15458n("rum")) == null) {
            return;
        }
        c16360mMo15458n.m17960a(new C4282f((String) interfaceC1426a.invoke(), map));
    }

    /* JADX INFO: renamed from: d */
    public final void m19605d(C17874a c17874a, int i10, InterfaceC1426a interfaceC1426a, Throwable th2, boolean z6, LinkedHashSet linkedHashSet) {
        Integer numValueOf = Integer.valueOf(m19601e(i10));
        c17874a.getClass();
        C17875b c17875b = C17875b.f56974Y;
        if (((Boolean) c17875b.invoke(numValueOf)).booleanValue()) {
            String message = (String) interfaceC1426a.invoke();
            InterfaceC13823a interfaceC13823a = this.f56977b;
            String name = interfaceC13823a != null ? interfaceC13823a.getName() : null;
            if (name != null) {
                message = AbstractC10763a.m11055m("[", name, "]: ", message);
            }
            if (z6) {
                if (linkedHashSet.contains(message)) {
                    return;
                } else {
                    linkedHashSet.add(message);
                }
            }
            int iM19601e = m19601e(i10);
            AbstractC16544l.m18094g(message, "message");
            if (((Boolean) c17875b.invoke(Integer.valueOf(iM19601e))).booleanValue()) {
                Log.println(iM19601e, "Datadog", message);
                if (th2 != null) {
                    Log.println(iM19601e, "Datadog", Log.getStackTraceString(th2));
                }
            }
        }
    }
}
