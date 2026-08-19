package p110E4;

/* JADX INFO: renamed from: E4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2313k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7193a;

    /* JADX INFO: renamed from: b */
    public final boolean f7194b;

    /* JADX INFO: renamed from: c */
    public final String f7195c;

    public /* synthetic */ C2313k(String str, boolean z6, int i10) {
        this.f7193a = i10;
        this.f7195c = str;
        this.f7194b = z6;
    }

    public String toString() {
        switch (this.f7193a) {
            case 2:
                String str = this.f7195c;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
                sb2.append("{");
                sb2.append(str);
                sb2.append("}");
                sb2.append(this.f7194b);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C2313k(boolean z6, String str, int i10) {
        this.f7193a = i10;
        this.f7194b = z6;
        this.f7195c = str;
    }
}
