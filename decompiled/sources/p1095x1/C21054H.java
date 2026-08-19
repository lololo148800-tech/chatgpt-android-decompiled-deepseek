package p1095x1;

import androidx.compose.p650ui.platform.AndroidComposeView;
import p1140z1.AbstractC21668N;
import p492U1.EnumC7546k;

/* JADX INFO: renamed from: x1.H */
/* JADX INFO: loaded from: classes.dex */
public final class C21054H extends AbstractC21068W {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f66969b;

    /* JADX INFO: renamed from: c */
    public final Object f66970c;

    public /* synthetic */ C21054H(Object obj, int i10) {
        this.f66969b = i10;
        this.f66970c = obj;
    }

    @Override // p1095x1.AbstractC21068W
    /* JADX INFO: renamed from: b */
    public final EnumC7546k mo21514b() {
        switch (this.f66969b) {
            case 0:
                return ((AbstractC21668N) this.f66970c).getLayoutDirection();
            default:
                return ((AndroidComposeView) this.f66970c).getLayoutDirection();
        }
    }

    @Override // p1095x1.AbstractC21068W
    /* JADX INFO: renamed from: c */
    public final int mo21515c() {
        switch (this.f66969b) {
            case 0:
                return ((AbstractC21668N) this.f66970c).mo21549L();
            default:
                return ((AndroidComposeView) this.f66970c).getRoot().m22011I();
        }
    }
}
