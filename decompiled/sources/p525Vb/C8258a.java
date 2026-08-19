package p525Vb;

import android.app.Activity;
import com.google.firebase.components.ComponentRegistrar;
import com.google.protobuf.InterfaceC12163j0;
import io.sentry.hints.InterfaceC15369h;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p001A.C0100z;
import p061C7.InterfaceC1612a;
import p265Kb.InterfaceC4623p;
import p523V9.AbstractC8088f6;
import p571X9.AbstractC9306j0;
import p572Xa.C9427u;
import p572Xa.InterfaceC9419m;
import p602Yi.C10065a;
import p602Yi.InterfaceC10066b;
import p676c7.C11688g;
import p774h1.C14327E;
import p774h1.C14365u;
import p784hb.InterfaceC14441j;
import p793ho.EnumC14679W1;
import p890mb.C17204a;
import p890mb.InterfaceC17208e;
import p909nm.AbstractC17680n;
import p959q8.InterfaceC18644f;

/* JADX INFO: renamed from: Vb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8258a implements InterfaceC1612a, InterfaceC17208e, InterfaceC4623p, InterfaceC18644f, InterfaceC9419m, InterfaceC10066b, InterfaceC14441j, InterfaceC12163j0, InterfaceC15369h {
    /* JADX INFO: renamed from: h */
    public static final long m8894h(int i10, List list) {
        return ((Number) AbstractC17680n.m19369s0(list).get(((int) Math.ceil((((double) i10) / 100.0d) * ((double) list.size()))) - 1)).longValue();
    }

    /* JADX INFO: renamed from: i */
    public static C14327E m8895i(List list, float f10, float f11, int i10) {
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = Float.POSITIVE_INFINITY;
        }
        return new C14327E(list, null, AbstractC8088f6.m8536b(f10, 0.0f), AbstractC8088f6.m8536b(f11, 0.0f), 0);
    }

    /* JADX INFO: renamed from: j */
    public static C14327E m8896j(List list) {
        return new C14327E(list, null, AbstractC8088f6.m8536b(0.0f, 0.0f), AbstractC8088f6.m8536b(0.0f, Float.POSITIVE_INFINITY), 0);
    }

    /* JADX INFO: renamed from: k */
    public static C14327E m8897k(C17309l[] c17309lArr) {
        C17309l[] c17309lArr2 = (C17309l[]) Arrays.copyOf(c17309lArr, c17309lArr.length);
        long jM8536b = AbstractC8088f6.m8536b(0.0f, 0.0f);
        long jM8536b2 = AbstractC8088f6.m8536b(0.0f, Float.POSITIVE_INFINITY);
        ArrayList arrayList = new ArrayList(c17309lArr2.length);
        for (C17309l c17309l : c17309lArr2) {
            arrayList.add(new C14365u(((C14365u) c17309l.f55137Z).f45062a));
        }
        ArrayList arrayList2 = new ArrayList(c17309lArr2.length);
        for (C17309l c17309l2 : c17309lArr2) {
            arrayList2.add(Float.valueOf(((Number) c17309l2.f55136Y).floatValue()));
        }
        return new C14327E(arrayList, arrayList2, jM8536b, jM8536b2, 0);
    }

    @Override // p784hb.InterfaceC14441j
    /* JADX INFO: renamed from: A */
    public Object mo3663A(Provider provider) {
        return provider == null ? KeyFactory.getInstance("SHA-512") : KeyFactory.getInstance("SHA-512", provider);
    }

    @Override // p265Kb.InterfaceC4623p
    /* JADX INFO: renamed from: R */
    public Object mo3263R() {
        return new ArrayDeque();
    }

    @Override // com.google.protobuf.InterfaceC12163j0
    /* JADX INFO: renamed from: a */
    public Object mo7515a(Object obj) {
        EnumC14679W1 enumC14679W1M16044a = EnumC14679W1.m16044a(((Integer) obj).intValue());
        return enumC14679W1M16044a == null ? EnumC14679W1.UNRECOGNIZED : enumC14679W1M16044a;
    }

    @Override // p959q8.InterfaceC18644f
    public boolean accept(Object obj) {
        Activity component = (Activity) obj;
        AbstractC16544l.m18094g(component, "component");
        return false;
    }

    @Override // p572Xa.InterfaceC9420n
    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object mo3447d() {
        return new C9427u("StandardIntegrity");
    }

    @Override // p890mb.InterfaceC17208e
    /* JADX INFO: renamed from: e */
    public List mo8898e(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C17204a c17204a : componentRegistrar.getComponents()) {
            String str = c17204a.f54920a;
            if (str != null) {
                C0100z c0100z = new C0100z(str, 15, c17204a);
                c17204a = new C17204a(str, c17204a.f54921b, c17204a.f54922c, c17204a.f54923d, c17204a.f54924e, c0100z, c17204a.f54926g);
            }
            arrayList.add(c17204a);
        }
        return arrayList;
    }

    @Override // p959q8.InterfaceC18644f
    /* JADX INFO: renamed from: f */
    public void mo8899f(Activity component) {
        AbstractC16544l.m18094g(component, "component");
    }

    @Override // p061C7.InterfaceC1612a
    /* JADX INFO: renamed from: g */
    public C11688g mo2453g() {
        return new C11688g();
    }

    @Override // p602Yi.InterfaceC10066b
    /* JADX INFO: renamed from: r */
    public void mo8900r(C10065a c10065a) {
        System.out.println((Object) ("[Segment " + AbstractC9306j0.m9903v(c10065a.f29809a) + ' ' + c10065a.f29810b));
    }

    @Override // p061C7.InterfaceC1612a
    /* JADX INFO: renamed from: b */
    public void mo2451b(Map map) {
    }

    @Override // p061C7.InterfaceC1612a
    /* JADX INFO: renamed from: c */
    public void mo2452c(String str, String str2, String str3, Map map) {
    }
}
