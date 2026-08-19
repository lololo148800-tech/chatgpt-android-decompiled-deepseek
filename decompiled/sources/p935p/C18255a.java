package p935p;

import android.graphics.drawable.Animatable;
import p353O4.C6119f;
import p594Y9.AbstractC9740H4;

/* JADX INFO: renamed from: p.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18255a extends AbstractC9740H4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58144a;

    /* JADX INFO: renamed from: b */
    public final Animatable f58145b;

    public /* synthetic */ C18255a(Animatable animatable, int i10) {
        this.f58144a = i10;
        this.f58145b = animatable;
    }

    @Override // p594Y9.AbstractC9740H4
    /* JADX INFO: renamed from: c */
    public final void mo10333c() {
        switch (this.f58144a) {
            case 0:
                this.f58145b.start();
                break;
            default:
                ((C6119f) this.f58145b).start();
                break;
        }
    }

    @Override // p594Y9.AbstractC9740H4
    /* JADX INFO: renamed from: d */
    public final void mo10334d() {
        switch (this.f58144a) {
            case 0:
                this.f58145b.stop();
                break;
            default:
                ((C6119f) this.f58145b).stop();
                break;
        }
    }
}
