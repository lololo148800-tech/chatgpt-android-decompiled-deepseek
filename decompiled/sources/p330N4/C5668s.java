package p330N4;

import android.view.View;
import android.view.ViewGroup;
import p544W9.AbstractC8603a4;

/* JADX INFO: renamed from: N4.s */
/* JADX INFO: loaded from: classes.dex */
public final class C5668s extends AbstractC8603a4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18390a;

    @Override // p330N4.InterfaceC5669t
    /* JADX INFO: renamed from: a */
    public final float mo6092a(ViewGroup viewGroup, View view) {
        switch (this.f18390a) {
            case 0:
                return view.getTranslationY() - viewGroup.getHeight();
            default:
                return view.getTranslationY() + viewGroup.getHeight();
        }
    }
}
