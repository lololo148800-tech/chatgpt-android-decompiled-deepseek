package p1081wc;

/* JADX INFO: renamed from: wc.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C20855A extends AbstractC20892k {

    /* JADX INFO: renamed from: c */
    public static final C20855A f66297c = new C20855A("Open Share Sheet", 0);

    /* JADX INFO: renamed from: d */
    public static final C20855A f66298d = new C20855A("Activate Whisper", 1);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f66299b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20855A(String str, int i10) {
        super(str);
        this.f66299b = i10;
    }

    @Override // p1081wc.AbstractC20892k
    /* JADX INFO: renamed from: a */
    public final String mo21446a() {
        switch (this.f66299b) {
            case 0:
                return "Share Sender";
            default:
                return "Whisper";
        }
    }
}
