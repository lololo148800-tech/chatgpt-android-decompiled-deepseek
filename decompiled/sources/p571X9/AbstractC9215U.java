package p571X9;

import android.view.View;
import android.widget.ImageView;
import com.withpersona.sdk2.inquiry.shared.p687ui.Pi2NavigationBar;
import io.sentry.android.replay.capture.C15272c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mk.C17280a;
import p049Bm.InterfaceC1426a;
import p271Kj.C4706a;
import p349O0.C5997d;
import p370P0.C6278E;
import p544W9.AbstractC8682o;

/* JADX INFO: renamed from: X9.U */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9215U {
    /* JADX INFO: renamed from: a */
    public static final void m9783a(C17280a navigationState, final InterfaceC1426a interfaceC1426a, final InterfaceC1426a interfaceC1426a2, Pi2NavigationBar navigationBar, View backPressHandler) {
        AbstractC16544l.m18094g(navigationState, "navigationState");
        AbstractC16544l.m18094g(navigationBar, "navigationBar");
        AbstractC16544l.m18094g(backPressHandler, "backPressHandler");
        boolean z6 = navigationState.f55090o0;
        C4706a c4706a = navigationBar.f40893G0;
        if (z6) {
            ((ImageView) c4706a.f15301c).setVisibility(navigationState.f55088Y ? 0 : 8);
            final int i10 = 0;
            View.OnClickListener onClickListener = new View.OnClickListener(i10, interfaceC1426a) { // from class: ok.e

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ int f58071Y;

                /* JADX INFO: renamed from: Z */
                public final /* synthetic */ AbstractC16546n f58072Z;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f58072Z = (AbstractC16546n) interfaceC1426a;
                }

                /* JADX WARN: Type inference failed for: r2v1, types: [Bm.a, kotlin.jvm.internal.n] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ?? r6 = this.f58072Z;
                    switch (this.f58071Y) {
                        case 0:
                            int i11 = Pi2NavigationBar.f40892H0;
                            r6.invoke();
                            break;
                        default:
                            int i12 = Pi2NavigationBar.f40892H0;
                            r6.invoke();
                            break;
                    }
                }
            };
            ImageView imageView = (ImageView) c4706a.f15301c;
            imageView.setOnClickListener(onClickListener);
            int i11 = navigationState.f55089Z ? 0 : 8;
            ImageView imageView2 = (ImageView) c4706a.f15302d;
            imageView2.setVisibility(i11);
            final int i12 = 1;
            imageView2.setOnClickListener(new View.OnClickListener(i12, interfaceC1426a2) { // from class: ok.e

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ int f58071Y;

                /* JADX INFO: renamed from: Z */
                public final /* synthetic */ AbstractC16546n f58072Z;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f58072Z = (AbstractC16546n) interfaceC1426a2;
                }

                /* JADX WARN: Type inference failed for: r2v1, types: [Bm.a, kotlin.jvm.internal.n] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ?? r6 = this.f58072Z;
                    switch (this.f58071Y) {
                        case 0:
                            int i13 = Pi2NavigationBar.f40892H0;
                            r6.invoke();
                            break;
                        default:
                            int i14 = Pi2NavigationBar.f40892H0;
                            r6.invoke();
                            break;
                    }
                }
            });
            boolean z10 = navigationState.f55091p0;
            imageView.setEnabled(z10);
            imageView2.setEnabled(z10);
        } else {
            ((ImageView) c4706a.f15301c).setVisibility(8);
            ((ImageView) c4706a.f15302d).setVisibility(8);
        }
        AbstractC8682o.m9380c(new C15272c(navigationState, interfaceC1426a, interfaceC1426a2), backPressHandler);
    }

    /* JADX INFO: renamed from: b */
    public static final void m9784b(C6278E c6278e, int i10, int i11) {
        int i12 = 1 << i10;
        int i13 = c6278e.f20392g;
        if ((i13 & i12) == 0) {
            c6278e.f20392g = i12 | i13;
            c6278e.f20388c[(c6278e.f20389d - c6278e.m6844h().f20379a) + i10] = i11;
        } else {
            C5997d.m6445c0("Already pushed argument " + c6278e.m6844h().mo6758b(i10));
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9785c(C6278E c6278e, int i10, Object obj) {
        int i11 = 1 << i10;
        int i12 = c6278e.f20393h;
        if ((i12 & i11) == 0) {
            c6278e.f20393h = i11 | i12;
            c6278e.f20390e[(c6278e.f20391f - c6278e.m6844h().f20380b) + i10] = obj;
        } else {
            C5997d.m6445c0("Already pushed argument " + c6278e.m6844h().mo6759c(i10));
            throw null;
        }
    }
}
