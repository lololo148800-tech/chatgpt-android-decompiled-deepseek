package p239Ja;

import com.google.android.material.internal.CheckableImageButton;
import p544W9.AbstractC8479G;

/* JADX INFO: renamed from: Ja.e */
/* JADX INFO: loaded from: classes.dex */
public final class C4302e extends AbstractC4314q {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f13989e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4302e(C4313p c4313p, int i10) {
        super(c4313p);
        this.f13989e = i10;
    }

    @Override // p239Ja.AbstractC4314q
    /* JADX INFO: renamed from: r */
    public void mo5049r() {
        switch (this.f13989e) {
            case 0:
                C4313p c4313p = this.f14043b;
                c4313p.f14022C0 = null;
                CheckableImageButton checkableImageButton = c4313p.f14036u0;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC8479G.m9125f(checkableImageButton, null);
                break;
        }
    }
}
