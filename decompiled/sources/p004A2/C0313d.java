package p004A2;

/* JADX INFO: renamed from: A2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0313d extends C0312c {

    /* JADX INFO: renamed from: c */
    public final Object f1086c;

    public C0313d() {
        super(12);
        this.f1086c = new Object();
    }

    @Override // p004A2.C0312c
    /* JADX INFO: renamed from: a */
    public final Object mo912a() {
        Object objMo912a;
        synchronized (this.f1086c) {
            objMo912a = super.mo912a();
        }
        return objMo912a;
    }

    @Override // p004A2.C0312c
    /* JADX INFO: renamed from: c */
    public final boolean mo914c(Object obj) {
        boolean zMo914c;
        synchronized (this.f1086c) {
            zMo914c = super.mo914c(obj);
        }
        return zMo914c;
    }
}
