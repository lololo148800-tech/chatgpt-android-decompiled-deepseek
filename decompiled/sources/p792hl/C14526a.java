package p792hl;

import p1089wl.AbstractC21010d;
import p265Kb.C4612e;

/* JADX INFO: renamed from: hl.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C14526a extends AbstractC21010d {

    /* JADX INFO: renamed from: g */
    public static final C4612e f45779g = new C4612e("Before", 5);

    /* JADX INFO: renamed from: h */
    public static final C4612e f45780h = new C4612e("State", 5);

    /* JADX INFO: renamed from: i */
    public static final C4612e f45781i = new C4612e("After", 5);

    /* JADX INFO: renamed from: j */
    public static final C4612e f45782j = new C4612e("Receive", 5);

    /* JADX INFO: renamed from: k */
    public static final C4612e f45783k = new C4612e("Parse", 5);

    /* JADX INFO: renamed from: l */
    public static final C4612e f45784l = new C4612e("Transform", 5);

    /* JADX INFO: renamed from: m */
    public static final C4612e f45785m = new C4612e("State", 5);

    /* JADX INFO: renamed from: n */
    public static final C4612e f45786n = new C4612e("After", 5);

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f45787e;

    /* JADX INFO: renamed from: f */
    public final boolean f45788f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14526a(int i10) {
        super(f45779g, f45780h, f45781i);
        this.f45787e = i10;
        switch (i10) {
            case 1:
                super(f45782j, f45783k, f45784l, f45785m, f45786n);
                this.f45788f = true;
                break;
            default:
                this.f45788f = true;
                break;
        }
    }

    @Override // p1089wl.AbstractC21010d
    /* JADX INFO: renamed from: d */
    public final boolean mo15174d() {
        switch (this.f45787e) {
            case 0:
                break;
        }
        return this.f45788f;
    }
}
