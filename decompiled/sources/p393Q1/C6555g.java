package p393Q1;

import android.text.style.ClickableSpan;
import android.view.View;
import p204I1.AbstractC3597m;
import p239Ja.C4307j;
import p478Tc.C7297a;

/* JADX INFO: renamed from: Q1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6555g extends ClickableSpan {

    /* JADX INFO: renamed from: Y */
    public final AbstractC3597m f21221Y;

    public C6555g(AbstractC3597m abstractC3597m) {
        this.f21221Y = abstractC3597m;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C4307j c4307jMo4305a = this.f21221Y.mo4305a();
        if (c4307jMo4305a != null) {
            ((C7297a) c4307jMo4305a.f13996Z).f23105a.invoke();
        }
    }
}
