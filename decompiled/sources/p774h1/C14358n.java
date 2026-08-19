package p774h1;

import android.graphics.BlendModeColorFilter;

/* JADX INFO: renamed from: h1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C14358n {

    /* JADX INFO: renamed from: a */
    public static final C14358n f45047a = new C14358n();

    /* JADX INFO: renamed from: a */
    public final BlendModeColorFilter m15769a(long j10, int i10) {
        AbstractC14357m.m15748f();
        return AbstractC14357m.m15745c(AbstractC14334L.m15617F(j10), AbstractC14334L.m15613B(i10));
    }

    /* JADX INFO: renamed from: b */
    public final C14356l m15770b(BlendModeColorFilter blendModeColorFilter) {
        int i10;
        long jM15625c = AbstractC14334L.m15625c(blendModeColorFilter.getColor());
        switch (AbstractC14346b.f45027a[blendModeColorFilter.getMode().ordinal()]) {
            case 1:
                i10 = 0;
                break;
            case 2:
                i10 = 1;
                break;
            case 3:
                i10 = 2;
                break;
            case 4:
            default:
                i10 = 3;
                break;
            case 5:
                i10 = 4;
                break;
            case 6:
                i10 = 5;
                break;
            case 7:
                i10 = 6;
                break;
            case 8:
                i10 = 7;
                break;
            case 9:
                i10 = 8;
                break;
            case 10:
                i10 = 9;
                break;
            case 11:
                i10 = 10;
                break;
            case 12:
                i10 = 11;
                break;
            case 13:
                i10 = 12;
                break;
            case 14:
                i10 = 13;
                break;
            case 15:
                i10 = 14;
                break;
            case 16:
                i10 = 15;
                break;
            case 17:
                i10 = 16;
                break;
            case 18:
                i10 = 17;
                break;
            case 19:
                i10 = 18;
                break;
            case 20:
                i10 = 19;
                break;
            case 21:
                i10 = 20;
                break;
            case 22:
                i10 = 21;
                break;
            case 23:
                i10 = 22;
                break;
            case 24:
                i10 = 23;
                break;
            case 25:
                i10 = 24;
                break;
            case 26:
                i10 = 25;
                break;
            case 27:
                i10 = 26;
                break;
            case 28:
                i10 = 27;
                break;
            case 29:
                i10 = 28;
                break;
        }
        return new C14356l(jM15625c, i10, blendModeColorFilter);
    }
}
