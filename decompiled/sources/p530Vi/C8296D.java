package p530Vi;

import kotlin.jvm.internal.AbstractC16544l;
import p1114xp.InterfaceC21330a;
import p1114xp.InterfaceC21331b;

/* JADX INFO: renamed from: Vi.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C8296D implements InterfaceC21330a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25851a;

    /* JADX INFO: renamed from: b */
    public final boolean f25852b;

    public /* synthetic */ C8296D(boolean z6, int i10) {
        this.f25851a = i10;
        this.f25852b = z6;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Set] */
    @Override // p1114xp.InterfaceC21330a
    /* JADX INFO: renamed from: a */
    public final InterfaceC21331b mo8905a(InterfaceC21331b interfaceC21331b) {
        switch (this.f25851a) {
            case 0:
                C8297E state = (C8297E) interfaceC21331b;
                AbstractC16544l.m18094g(state, "state");
                return new C8297E(state.f25853a, state.f25854b, state.f25855c, state.f25856d, this.f25852b);
            default:
                C8297E state2 = (C8297E) interfaceC21331b;
                AbstractC16544l.m18094g(state2, "state");
                return new C8297E(state2.f25853a, state2.f25854b, this.f25852b, state2.f25856d, state2.f25857e);
        }
    }
}
