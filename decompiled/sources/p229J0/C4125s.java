package p229J0;

/* JADX INFO: renamed from: J0.s */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4125s implements InterfaceC4045e3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13311a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC3923H4 f13312b;

    public /* synthetic */ C4125s(InterfaceC3923H4 interfaceC3923H4, int i10) {
        this.f13311a = i10;
        this.f13312b = interfaceC3923H4;
    }

    @Override // p229J0.InterfaceC4045e3
    /* JADX INFO: renamed from: a */
    public final float mo4606a() {
        C3935J4 state;
        C3935J4 state2;
        switch (this.f13311a) {
            case 0:
                InterfaceC3923H4 interfaceC3923H4 = this.f13312b;
                if (interfaceC3923H4 == null || (state = interfaceC3923H4.getState()) == null) {
                    return 0.0f;
                }
                return state.f12117c.m6409g();
            default:
                InterfaceC3923H4 interfaceC3923H5 = this.f13312b;
                if (interfaceC3923H5 == null || (state2 = interfaceC3923H5.getState()) == null) {
                    return 0.0f;
                }
                return state2.f12117c.m6409g();
        }
    }
}
