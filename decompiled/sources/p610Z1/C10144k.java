package p610Z1;

/* JADX INFO: renamed from: Z1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C10144k extends AbstractC10141h {

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C10145l f30068t0;

    public C10144k(C10145l c10145l) {
        this.f30068t0 = c10145l;
    }

    @Override // p610Z1.AbstractC10141h
    /* JADX INFO: renamed from: i */
    public final String mo10743i() {
        C10142i c10142i = (C10142i) this.f30068t0.f30069Y.get();
        if (c10142i == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + c10142i.f30064a + "]";
    }
}
