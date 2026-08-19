package p530Vi;

import bo.C11534v;
import com.segment.analytics.kotlin.core.Settings;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.C16644c;
import p1114xp.InterfaceC21330a;
import p1114xp.InterfaceC21331b;
import p523V9.AbstractC8010V3;
import p646aj.AbstractC10628h;
import p909nm.AbstractC17665J;

/* JADX INFO: renamed from: Vi.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C8295C implements InterfaceC21330a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25849a;

    /* JADX INFO: renamed from: b */
    public Object f25850b;

    public /* synthetic */ C8295C(int i10) {
        this.f25849a = i10;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Set] */
    @Override // p1114xp.InterfaceC21330a
    /* JADX INFO: renamed from: a */
    public final InterfaceC21331b mo8905a(InterfaceC21331b interfaceC21331b) {
        Settings settings;
        C16644c c16644c;
        switch (this.f25849a) {
            case 0:
                C8297E state = (C8297E) interfaceC21331b;
                AbstractC16544l.m18094g(state, "state");
                C11534v c11534v = new C11534v(0);
                Settings settings2 = state.f25854b;
                if (settings2 != null && (c16644c = settings2.f40498a) != null) {
                    AbstractC10628h.m11000b(c11534v, c16644c);
                }
                AbstractC8010V3.m8324c(c11534v, (String) this.f25850b, Boolean.TRUE);
                C16644c c16644cM12925a = c11534v.m12925a();
                if (settings2 != null) {
                    C16644c plan = settings2.f40499b;
                    AbstractC16544l.m18094g(plan, "plan");
                    C16644c edgeFunction = settings2.f40500c;
                    AbstractC16544l.m18094g(edgeFunction, "edgeFunction");
                    C16644c middlewareSettings = settings2.f40501d;
                    AbstractC16544l.m18094g(middlewareSettings, "middlewareSettings");
                    C16644c metrics = settings2.f40502e;
                    AbstractC16544l.m18094g(metrics, "metrics");
                    C16644c consentSettings = settings2.f40503f;
                    AbstractC16544l.m18094g(consentSettings, "consentSettings");
                    settings = new Settings(c16644cM12925a, plan, edgeFunction, middlewareSettings, metrics, consentSettings);
                } else {
                    settings = null;
                }
                return new C8297E(state.f25853a, settings, state.f25855c, state.f25856d, state.f25857e);
            case 1:
                C8297E state2 = (C8297E) interfaceC21331b;
                AbstractC16544l.m18094g(state2, "state");
                return new C8297E(state2.f25853a, state2.f25854b, state2.f25855c, AbstractC17665J.m19266f(state2.f25856d, (Set) this.f25850b), state2.f25857e);
            default:
                C8297E state3 = (C8297E) interfaceC21331b;
                AbstractC16544l.m18094g(state3, "state");
                return new C8297E(state3.f25853a, (Settings) this.f25850b, state3.f25855c, state3.f25856d, state3.f25857e);
        }
    }
}
