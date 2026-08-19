package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.internal.gestures.C15387c;
import io.sentry.internal.gestures.EnumC15386b;
import io.sentry.internal.gestures.InterfaceC15385a;
import p544W9.AbstractC8686o3;
import p544W9.AbstractC8692p3;

/* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C15219a implements InterfaceC15385a {

    /* JADX INFO: renamed from: a */
    public final boolean f47484a;

    /* JADX INFO: renamed from: b */
    public final int[] f47485b = new int[2];

    public C15219a(boolean z6) {
        this.f47484a = z6;
    }

    @Override // io.sentry.internal.gestures.InterfaceC15385a
    /* JADX INFO: renamed from: a */
    public final C15387c mo16426a(View view, float f10, float f11, EnumC15386b enumC15386b) {
        int[] iArr = this.f47485b;
        view.getLocationOnScreen(iArr);
        boolean z6 = false;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        if (f10 < i10 || f10 > i10 + width || f11 < i11 || f11 > i11 + height) {
            return null;
        }
        if (enumC15386b == EnumC15386b.CLICKABLE && view.isClickable() && view.getVisibility() == 0) {
            try {
                return new C15387c(view, AbstractC8692p3.m9388a(view), AbstractC8686o3.m9384c(view), null, "old_view_system");
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
        if (enumC15386b != EnumC15386b.SCROLLABLE) {
            return null;
        }
        if (((!this.f47484a ? false : ScrollingView.class.isAssignableFrom(view.getClass())) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0) {
            z6 = true;
        }
        if (!z6) {
            return null;
        }
        try {
            return new C15387c(view, AbstractC8692p3.m9388a(view), AbstractC8686o3.m9384c(view), null, "old_view_system");
        } catch (Resources.NotFoundException unused2) {
            return null;
        }
    }
}
