package p523V9;

import android.graphics.Paint;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
import cc.C11699d;
import mm.C17296C;
import p030B2.AbstractC0761i;
import p030B2.AbstractC0767l;
import p1013t0.C19721i;
import p1013t0.C19722j;
import p1013t0.InterfaceC19713a;
import p108E2.ActionModeCallbackC2256o;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p1140z1.InterfaceC21704m;
import p1141z2.C21724c;
import p283L5.AbstractC4941g;
import p501Ub.C7604f;
import p635a1.AbstractC10458p;
import p704dc.C13060a;
import p704dc.C13062c;
import p704dc.C13065f;
import p759g1.C13801c;
import p823j3.C16084f;
import p996rm.EnumC19250a;
import p999s.C19329Y;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: V9.p4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8166p4 {
    /* JADX INFO: renamed from: a */
    public static C13060a m8733a(C11699d c11699d) {
        C13062c c13062c = (C13062c) C7604f.m7950c().m7951a(C13062c.class);
        c13062c.getClass();
        return new C13060a((C13065f) c13062c.f41490a.m4539y(c11699d), c13062c.f41491b, c11699d);
    }

    /* JADX INFO: renamed from: b */
    public static C21724c m8734b(C19329Y c19329y) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new C21724c(AbstractC0761i.m1680l(c19329y));
        }
        TextPaint textPaint = new TextPaint(c19329y.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c19329y.getBreakStrategy();
        int hyphenationFrequency = c19329y.getHyphenationFrequency();
        if (c19329y.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i10 < 28 || (c19329y.getInputType() & 15) != 3) {
            boolean z6 = c19329y.getLayoutDirection() == 1;
            switch (c19329y.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z6) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(AbstractC0761i.m1671c(AbstractC0767l.m1708c(c19329y.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C21724c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    /* JADX INFO: renamed from: c */
    public static final Object m8735c(InterfaceC21704m interfaceC21704m, C13801c c13801c, AbstractC19687c abstractC19687c) {
        InterfaceC19713a interfaceC19713a;
        Object objMo20664h0;
        boolean z6 = ((AbstractC10458p) interfaceC21704m).f30960Y.f30972y0;
        C17296C c17296c = C17296C.f55119a;
        if (!z6) {
            return c17296c;
        }
        AbstractC21678Y abstractC21678YM22216u = AbstractC21690f.m22216u(interfaceC21704m);
        if (((AbstractC10458p) interfaceC21704m).f30960Y.f30972y0) {
            InterfaceC19713a c19722j = (InterfaceC19713a) AbstractC21690f.m22205j(interfaceC21704m, C19721i.f62432B0);
            if (c19722j == null) {
                c19722j = new C19722j(interfaceC21704m);
            }
            interfaceC19713a = c19722j;
        } else {
            interfaceC19713a = null;
        }
        return (interfaceC19713a != null && (objMo20664h0 = interfaceC19713a.mo20664h0(abstractC21678YM22216u, new C16084f(c13801c, 15, abstractC21678YM22216u), abstractC19687c)) == EnumC19250a.f61036Y) ? objMo20664h0 : c17296c;
    }

    /* JADX INFO: renamed from: d */
    public static void m8736d(TextView textView, int i10) {
        AbstractC4941g.m5557P(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0761i.m1684p(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m8737e(TextView textView, int i10) {
        AbstractC4941g.m5557P(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m8738f(TextView textView, int i10) {
        AbstractC4941g.m5557P(i10);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    /* JADX INFO: renamed from: g */
    public static ActionMode.Callback m8739g(ActionMode.Callback callback) {
        return (!(callback instanceof ActionModeCallbackC2256o) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionModeCallbackC2256o) callback).f6907a;
    }

    /* JADX INFO: renamed from: h */
    public static ActionMode.Callback m8740h(ActionMode.Callback callback, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof ActionModeCallbackC2256o) || callback == null) ? callback : new ActionModeCallbackC2256o(callback, textView);
    }
}
