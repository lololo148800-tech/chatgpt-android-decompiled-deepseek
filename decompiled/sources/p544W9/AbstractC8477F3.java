package p544W9;

import android.gov.nist.javax.sip.header.ParameterNames;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p1155zi.C21936L0;
import p1155zi.C21984a1;
import p1155zi.C22011h0;
import p318Mh.C5370J0;
import p318Mh.C5372K0;
import p318Mh.EnumC5368I0;

/* JADX INFO: renamed from: W9.F3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8477F3 {
    /* JADX INFO: renamed from: a */
    public static final C5370J0 m9111a(EnumC5368I0 enumC5368I0) {
        return new C5370J0("animation", new C5372K0(EnumC5368I0.Companion.serializer(), true), false, enumC5368I0);
    }

    /* JADX INFO: renamed from: b */
    public static C5370J0 m9112b() {
        return new C5370J0(ParameterNames.f31999ID, new C5372K0(C22011h0.Companion.serializer(), false), true, null);
    }

    /* JADX INFO: renamed from: c */
    public static C5370J0 m9113c() {
        return new C5370J0(ParameterNames.f31999ID, new C5372K0(C21936L0.Companion.serializer(), false), true, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m9114d(Class cls, Object obj, InterfaceC15127H interfaceC15127H) {
        interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }

    /* JADX INFO: renamed from: e */
    public static C5370J0 m9115e() {
        return new C5370J0("messageId", new C5372K0(C21984a1.Companion.serializer(), false), true, null);
    }

    /* JADX INFO: renamed from: f */
    public static C5370J0 m9116f(String str, KSerializer serializer) {
        AbstractC16544l.m18094g(serializer, "serializer");
        return new C5370J0(str, new C5372K0(serializer, true), false, null);
    }

    /* JADX INFO: renamed from: g */
    public static final C5370J0 m9117g(String str, KSerializer serializer, Object obj) {
        AbstractC16544l.m18094g(serializer, "serializer");
        return new C5370J0(str, new C5372K0(serializer, false), true, obj);
    }
}
