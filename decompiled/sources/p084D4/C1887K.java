package p084D4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: D4.K */
/* JADX INFO: loaded from: classes.dex */
public final class C1887K extends AbstractC1888L {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1887K(AbstractC1900Y abstractC1900Y, int i10) {
        super(abstractC1900Y);
        this.f5516d = i10;
    }

    @Override // p084D4.AbstractC1888L
    /* JADX INFO: renamed from: b */
    public final int mo2876b(View view) {
        switch (this.f5516d) {
            case 0:
                C1901Z c1901z = (C1901Z) view.getLayoutParams();
                ((AbstractC1900Y) this.f5518b).getClass();
                return view.getRight() + ((C1901Z) view.getLayoutParams()).f5558b.right + ((ViewGroup.MarginLayoutParams) c1901z).rightMargin;
            default:
                C1901Z c1901z2 = (C1901Z) view.getLayoutParams();
                ((AbstractC1900Y) this.f5518b).getClass();
                return view.getBottom() + ((C1901Z) view.getLayoutParams()).f5558b.bottom + ((ViewGroup.MarginLayoutParams) c1901z2).bottomMargin;
        }
    }

    @Override // p084D4.AbstractC1888L
    /* JADX INFO: renamed from: c */
    public final int mo2877c(View view) {
        switch (this.f5516d) {
            case 0:
                C1901Z c1901z = (C1901Z) view.getLayoutParams();
                ((AbstractC1900Y) this.f5518b).getClass();
                Rect rect = ((C1901Z) view.getLayoutParams()).f5558b;
                return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1901z).leftMargin + ((ViewGroup.MarginLayoutParams) c1901z).rightMargin;
            default:
                C1901Z c1901z2 = (C1901Z) view.getLayoutParams();
                ((AbstractC1900Y) this.f5518b).getClass();
                Rect rect2 = ((C1901Z) view.getLayoutParams()).f5558b;
                return view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1901z2).topMargin + ((ViewGroup.MarginLayoutParams) c1901z2).bottomMargin;
        }
    }

    @Override // p084D4.AbstractC1888L
    /* JADX INFO: renamed from: d */
    public final int mo2878d(View view) {
        switch (this.f5516d) {
            case 0:
                C1901Z c1901z = (C1901Z) view.getLayoutParams();
                ((AbstractC1900Y) this.f5518b).getClass();
                Rect rect = ((C1901Z) view.getLayoutParams()).f5558b;
                return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1901z).topMargin + ((ViewGroup.MarginLayoutParams) c1901z).bottomMargin;
            default:
                C1901Z c1901z2 = (C1901Z) view.getLayoutParams();
                ((AbstractC1900Y) this.f5518b).getClass();
                Rect rect2 = ((C1901Z) view.getLayoutParams()).f5558b;
                return view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c1901z2).leftMargin + ((ViewGroup.MarginLayoutParams) c1901z2).rightMargin;
        }
    }

    @Override // p084D4.AbstractC1888L
    /* JADX INFO: renamed from: e */
    public final int mo2879e(View view) {
        switch (this.f5516d) {
            case 0:
                C1901Z c1901z = (C1901Z) view.getLayoutParams();
                ((AbstractC1900Y) this.f5518b).getClass();
                return (view.getLeft() - ((C1901Z) view.getLayoutParams()).f5558b.left) - ((ViewGroup.MarginLayoutParams) c1901z).leftMargin;
            default:
                C1901Z c1901z2 = (C1901Z) view.getLayoutParams();
                ((AbstractC1900Y) this.f5518b).getClass();
                return (view.getTop() - ((C1901Z) view.getLayoutParams()).f5558b.top) - ((ViewGroup.MarginLayoutParams) c1901z2).topMargin;
        }
    }

    @Override // p084D4.AbstractC1888L
    /* JADX INFO: renamed from: f */
    public final int mo2880f() {
        switch (this.f5516d) {
            case 0:
                return ((AbstractC1900Y) this.f5518b).f5555n;
            default:
                return ((AbstractC1900Y) this.f5518b).f5556o;
        }
    }

    @Override // p084D4.AbstractC1888L
    /* JADX INFO: renamed from: g */
    public final int mo2881g() {
        switch (this.f5516d) {
            case 0:
                AbstractC1900Y abstractC1900Y = (AbstractC1900Y) this.f5518b;
                return abstractC1900Y.f5555n - abstractC1900Y.m2926D();
            default:
                AbstractC1900Y abstractC1900Y2 = (AbstractC1900Y) this.f5518b;
                return abstractC1900Y2.f5556o - abstractC1900Y2.m2924B();
        }
    }

    @Override // p084D4.AbstractC1888L
    /* JADX INFO: renamed from: h */
    public final int mo2882h() {
        switch (this.f5516d) {
            case 0:
                return ((AbstractC1900Y) this.f5518b).m2926D();
            default:
                return ((AbstractC1900Y) this.f5518b).m2924B();
        }
    }

    @Override // p084D4.AbstractC1888L
    /* JADX INFO: renamed from: i */
    public final int mo2883i() {
        switch (this.f5516d) {
            case 0:
                return ((AbstractC1900Y) this.f5518b).f5553l;
            default:
                return ((AbstractC1900Y) this.f5518b).f5554m;
        }
    }

    @Override // p084D4.AbstractC1888L
    /* JADX INFO: renamed from: j */
    public final int mo2884j() {
        switch (this.f5516d) {
            case 0:
                return ((AbstractC1900Y) this.f5518b).f5554m;
            default:
                return ((AbstractC1900Y) this.f5518b).f5553l;
        }
    }

    @Override // p084D4.AbstractC1888L
    /* JADX INFO: renamed from: k */
    public final int mo2885k() {
        switch (this.f5516d) {
            case 0:
                return ((AbstractC1900Y) this.f5518b).m2925C();
            default:
                return ((AbstractC1900Y) this.f5518b).m2927E();
        }
    }

    @Override // p084D4.AbstractC1888L
    /* JADX INFO: renamed from: l */
    public final int mo2886l() {
        switch (this.f5516d) {
            case 0:
                AbstractC1900Y abstractC1900Y = (AbstractC1900Y) this.f5518b;
                return (abstractC1900Y.f5555n - abstractC1900Y.m2925C()) - abstractC1900Y.m2926D();
            default:
                AbstractC1900Y abstractC1900Y2 = (AbstractC1900Y) this.f5518b;
                return (abstractC1900Y2.f5556o - abstractC1900Y2.m2927E()) - abstractC1900Y2.m2924B();
        }
    }

    @Override // p084D4.AbstractC1888L
    /* JADX INFO: renamed from: n */
    public final int mo2887n(View view) {
        switch (this.f5516d) {
            case 0:
                AbstractC1900Y abstractC1900Y = (AbstractC1900Y) this.f5518b;
                Rect rect = (Rect) this.f5519c;
                abstractC1900Y.m2929I(rect, view);
                return rect.right;
            default:
                AbstractC1900Y abstractC1900Y2 = (AbstractC1900Y) this.f5518b;
                Rect rect2 = (Rect) this.f5519c;
                abstractC1900Y2.m2929I(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // p084D4.AbstractC1888L
    /* JADX INFO: renamed from: o */
    public final int mo2888o(View view) {
        switch (this.f5516d) {
            case 0:
                AbstractC1900Y abstractC1900Y = (AbstractC1900Y) this.f5518b;
                Rect rect = (Rect) this.f5519c;
                abstractC1900Y.m2929I(rect, view);
                return rect.left;
            default:
                AbstractC1900Y abstractC1900Y2 = (AbstractC1900Y) this.f5518b;
                Rect rect2 = (Rect) this.f5519c;
                abstractC1900Y2.m2929I(rect2, view);
                return rect2.top;
        }
    }

    @Override // p084D4.AbstractC1888L
    /* JADX INFO: renamed from: p */
    public final void mo2889p(int i10) {
        switch (this.f5516d) {
            case 0:
                ((AbstractC1900Y) this.f5518b).mo2931M(i10);
                break;
            default:
                ((AbstractC1900Y) this.f5518b).mo2932N(i10);
                break;
        }
    }
}
