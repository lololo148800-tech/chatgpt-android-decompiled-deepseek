package p1081wc;

/* JADX INFO: renamed from: wc.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C20886e extends AbstractC20882b {

    /* JADX INFO: renamed from: d */
    public static final C20886e f66516d = new C20886e("Chart Click", 0);

    /* JADX INFO: renamed from: e */
    public static final C20886e f66517e = new C20886e("Chart View", 1);

    /* JADX INFO: renamed from: f */
    public static final C20886e f66518f = new C20886e("Visualization Generated", 2);

    /* JADX INFO: renamed from: g */
    public static final C20886e f66519g = new C20886e("Attach Conversation", 3);

    /* JADX INFO: renamed from: h */
    public static final C20886e f66520h = new C20886e("Confirm Image Share", 4);

    /* JADX INFO: renamed from: i */
    public static final C20886e f66521i = new C20886e("Image Download", 5);

    /* JADX INFO: renamed from: j */
    public static final C20886e f66522j = new C20886e("Image Rating", 6);

    /* JADX INFO: renamed from: k */
    public static final C20886e f66523k = new C20886e("Image Share", 7);

    /* JADX INFO: renamed from: l */
    public static final C20886e f66524l = new C20886e("Image View Full", 8);

    /* JADX INFO: renamed from: m */
    public static final C20886e f66525m = new C20886e("Inpaint Click", 9);

    /* JADX INFO: renamed from: n */
    public static final C20886e f66526n = new C20886e("Transform Click", 10);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f66527c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20886e(String str, int i10) {
        super(str, 7);
        this.f66527c = i10;
    }

    @Override // p1081wc.AbstractC20882b, p1081wc.AbstractC20892k
    public String toString() {
        switch (this.f66527c) {
            case 6:
                return "chatgpt_dalle_image_rating";
            default:
                return super.toString();
        }
    }
}
