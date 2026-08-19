package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.openai.chatgpt.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p030B2.C0717A0;
import p030B2.C0721C0;
import p030B2.C0723D0;
import p030B2.C0795z;
import p030B2.C0796z0;
import p1023ta.ViewOnTouchListenerC19829a;
import p140Fa.C2687g;
import p174Gk.uSfJ.HpucjswO;
import p523V9.AbstractC7972Q3;
import p523V9.AbstractC8070d4;
import p523V9.AbstractC8170q0;
import p523V9.AbstractC8186s0;
import p571X9.AbstractC9106B3;
import p588Y2.DialogInterfaceOnCancelListenerC9628l;
import p979r2.AbstractC18861b;

/* JADX INFO: renamed from: com.google.android.material.datepicker.o */
/* JADX INFO: loaded from: classes.dex */
public final class C12050o<S> extends DialogInterfaceOnCancelListenerC9628l {

    /* JADX INFO: renamed from: A1 */
    public C12048m f36591A1;

    /* JADX INFO: renamed from: B1 */
    public int f36592B1;

    /* JADX INFO: renamed from: C1 */
    public CharSequence f36593C1;

    /* JADX INFO: renamed from: D1 */
    public boolean f36594D1;

    /* JADX INFO: renamed from: E1 */
    public int f36595E1;

    /* JADX INFO: renamed from: F1 */
    public int f36596F1;

    /* JADX INFO: renamed from: G1 */
    public CharSequence f36597G1;

    /* JADX INFO: renamed from: H1 */
    public int f36598H1;

    /* JADX INFO: renamed from: I1 */
    public CharSequence f36599I1;

    /* JADX INFO: renamed from: J1 */
    public TextView f36600J1;

    /* JADX INFO: renamed from: K1 */
    public CheckableImageButton f36601K1;

    /* JADX INFO: renamed from: L1 */
    public C2687g f36602L1;

    /* JADX INFO: renamed from: M1 */
    public Button f36603M1;

    /* JADX INFO: renamed from: N1 */
    public boolean f36604N1;

    /* JADX INFO: renamed from: O1 */
    public CharSequence f36605O1;

    /* JADX INFO: renamed from: P1 */
    public CharSequence f36606P1;

    /* JADX INFO: renamed from: v1 */
    public final LinkedHashSet f36607v1;

    /* JADX INFO: renamed from: w1 */
    public final LinkedHashSet f36608w1;

    /* JADX INFO: renamed from: x1 */
    public int f36609x1;

    /* JADX INFO: renamed from: y1 */
    public AbstractC12057v f36610y1;

    /* JADX INFO: renamed from: z1 */
    public C12037b f36611z1;

    public C12050o() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f36607v1 = new LinkedHashSet();
        this.f36608w1 = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: S */
    public static int m13628S(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarM13639b = AbstractC12060y.m13639b();
        calendarM13639b.set(5, 1);
        Calendar calendarM13638a = AbstractC12060y.m13638a(calendarM13639b);
        calendarM13638a.get(2);
        calendarM13638a.get(1);
        int maximum = calendarM13638a.getMaximum(7);
        calendarM13638a.getActualMaximum(5);
        calendarM13638a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* JADX INFO: renamed from: T */
    public static boolean m13629T(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC7972Q3.m8265f(R.attr.materialCalendarStyle, context, C12048m.class.getCanonicalName()).data, new int[]{i10});
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z6;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: A */
    public final View mo5181A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.f36594D1 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f36594D1) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m13628S(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m13628S(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        textView.setAccessibilityLiveRegion(1);
        this.f36601K1 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f36600J1 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f36601K1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f36601K1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC9106B3.m9636b(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC9106B3.m9636b(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f36601K1.setChecked(this.f36595E1 != 0);
        AbstractC0738T.m1584l(this.f36601K1, null);
        CheckableImageButton checkableImageButton2 = this.f36601K1;
        this.f36601K1.setContentDescription(checkableImageButton2.f36659r0 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f36601K1.setOnClickListener(new ViewOnClickListenerC12047l(this, 1));
        this.f36603M1 = (Button) viewInflate.findViewById(R.id.confirm_button);
        m13630R();
        throw null;
    }

    @Override // p588Y2.DialogInterfaceOnCancelListenerC9628l, androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: G */
    public final void mo10178G(Bundle bundle) {
        super.mo10178G(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f36609x1);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C12037b c12037b = this.f36611z1;
        C12036a c12036a = new C12036a();
        int i10 = C12036a.f36550b;
        int i11 = C12036a.f36550b;
        long j10 = c12037b.f36552Y.f36619r0;
        long j11 = c12037b.f36553Z.f36619r0;
        c12036a.f36551a = Long.valueOf(c12037b.f36555p0.f36619r0);
        C12048m c12048m = this.f36591A1;
        C12052q c12052q = c12048m == null ? null : c12048m.f36579k1;
        if (c12052q != null) {
            c12036a.f36551a = Long.valueOf(c12052q.f36619r0);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c12037b.f36554o0);
        C12052q c12052qM13632b = C12052q.m13632b(j10);
        C12052q c12052qM13632b2 = C12052q.m13632b(j11);
        C12040e c12040e = (C12040e) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l4 = c12036a.f36551a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C12037b(c12052qM13632b, c12052qM13632b2, c12040e, l4 == null ? null : C12052q.m13632b(l4.longValue()), c12037b.f36556q0));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f36592B1);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f36593C1);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f36596F1);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f36597G1);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f36598H1);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f36599I1);
    }

    @Override // p588Y2.DialogInterfaceOnCancelListenerC9628l, androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: H */
    public final void mo10179H() {
        AbstractC12057v abstractC12057v;
        AbstractC8186s0 c0717a0;
        AbstractC8186s0 c0717a1;
        int i10 = 3;
        super.mo10179H();
        Dialog dialog = this.f29021q1;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f36594D1) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f36602L1);
            if (!this.f36604N1) {
                View viewFindViewById = m11744N().findViewById(R.id.fullscreen_header);
                Integer numValueOf = viewFindViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) viewFindViewById.getBackground()).getColor()) : null;
                int i11 = Build.VERSION.SDK_INT;
                boolean z6 = false;
                boolean z10 = numValueOf == null || numValueOf.intValue() == 0;
                int iM8477d = AbstractC8070d4.m8477d(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z10) {
                    numValueOf = Integer.valueOf(iM8477d);
                }
                AbstractC8170q0.m8754c(window, false);
                window.getContext();
                int iM20169g = i11 < 27 ? AbstractC18861b.m20169g(AbstractC8070d4.m8477d(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iM20169g);
                boolean z11 = AbstractC8070d4.m8479f(0) || AbstractC8070d4.m8479f(numValueOf.intValue());
                View decorView = window.getDecorView();
                if (Build.VERSION.SDK_INT >= 30) {
                    new C0795z(decorView, i10).f2210o0 = decorView;
                }
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 35) {
                    c0717a0 = new C0723D0(window);
                } else if (i12 >= 30) {
                    c0717a0 = new C0721C0(window);
                } else {
                    c0717a0 = i12 >= 26 ? new C0717A0(window) : new C0796z0(window);
                }
                c0717a0.mo1532c(z11);
                boolean zM8479f = AbstractC8070d4.m8479f(iM8477d);
                if (AbstractC8070d4.m8479f(iM20169g) || (iM20169g == 0 && zM8479f)) {
                    z6 = true;
                }
                View decorView2 = window.getDecorView();
                if (Build.VERSION.SDK_INT >= 30) {
                    new C0795z(decorView2, i10).f2210o0 = decorView2;
                }
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 35) {
                    c0717a1 = new C0723D0(window);
                } else if (i13 >= 30) {
                    c0717a1 = new C0721C0(window);
                } else {
                    c0717a1 = i13 >= 26 ? new C0717A0(window) : new C0796z0(window);
                }
                c0717a1.mo1489b(z6);
                C12049n c12049n = new C12049n(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                AbstractC0730K.m1555l(viewFindViewById, c12049n);
                this.f36604N1 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m11743M().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f36602L1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView3 = window.getDecorView();
            Dialog dialog2 = this.f29021q1;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView3.setOnTouchListener(new ViewOnTouchListenerC19829a(dialog2, rect));
        }
        m11743M();
        int i14 = this.f36609x1;
        if (i14 == 0) {
            m13630R();
            throw null;
        }
        m13630R();
        C12037b c12037b = this.f36611z1;
        C12048m c12048m = new C12048m();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i14);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c12037b);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable(HpucjswO.RHYqESSoU, c12037b.f36555p0);
        c12048m.m11746P(bundle);
        this.f36591A1 = c12048m;
        boolean z12 = this.f36601K1.f36659r0;
        if (z12) {
            abstractC12057v = c12048m;
            m13630R();
            C12037b c12037b2 = this.f36611z1;
            C12051p c12051p = new C12051p();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i14);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c12037b2);
            c12051p.m11746P(bundle2);
            abstractC12057v = c12051p;
        }
        abstractC12057v = c12048m;
        this.f36610y1 = abstractC12057v;
        this.f36600J1.setText((z12 && m11743M().getResources().getConfiguration().orientation == 2) ? this.f36606P1 : this.f36605O1);
        m13630R();
        throw null;
    }

    @Override // p588Y2.DialogInterfaceOnCancelListenerC9628l, androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: I */
    public final void mo10180I() {
        this.f36610y1.f36633h1.clear();
        super.mo10180I();
    }

    @Override // p588Y2.DialogInterfaceOnCancelListenerC9628l
    /* JADX INFO: renamed from: Q */
    public final Dialog mo10183Q() {
        Context contextM11743M = m11743M();
        m11743M();
        int i10 = this.f36609x1;
        if (i10 == 0) {
            m13630R();
            throw null;
        }
        Dialog dialog = new Dialog(contextM11743M, i10);
        Context context = dialog.getContext();
        this.f36594D1 = m13629T(context, android.R.attr.windowFullscreen);
        int i11 = AbstractC7972Q3.m8265f(R.attr.colorSurface, context, C12050o.class.getCanonicalName()).data;
        C2687g c2687g = new C2687g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        this.f36602L1 = c2687g;
        c2687g.m3679i(context);
        this.f36602L1.m3682l(ColorStateList.valueOf(i11));
        C2687g c2687g2 = this.f36602L1;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        c2687g2.m3681k(AbstractC0730K.m1548e(decorView));
        return dialog;
    }

    /* JADX INFO: renamed from: R */
    public final void m13630R() {
    }

    @Override // p588Y2.DialogInterfaceOnCancelListenerC9628l, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f36607v1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // p588Y2.DialogInterfaceOnCancelListenerC9628l, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f36608w1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f33135Q0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // p588Y2.DialogInterfaceOnCancelListenerC9628l, androidx.fragment.app.AbstractComponentCallbacksC11000a
    /* JADX INFO: renamed from: z */
    public final void mo5187z(Bundle bundle) {
        super.mo5187z(bundle);
        if (bundle == null) {
            bundle = this.f33156r0;
        }
        this.f36609x1 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f36611z1 = (C12037b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f36592B1 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f36593C1 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f36595E1 = bundle.getInt("INPUT_MODE_KEY");
        this.f36596F1 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f36597G1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f36598H1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f36599I1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence text = this.f36593C1;
        if (text == null) {
            text = m11743M().getResources().getText(this.f36592B1);
        }
        this.f36605O1 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), Separators.RETURN);
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f36606P1 = text;
    }
}
