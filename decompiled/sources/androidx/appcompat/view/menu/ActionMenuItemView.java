package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import p523V9.AbstractC8194t0;
import p880m.AbstractC17123a;
import p976r.AbstractC18805c;
import p976r.C18804b;
import p976r.C18816n;
import p976r.InterfaceC18813k;
import p976r.InterfaceC18827y;
import p976r.MenuC18814l;
import p999s.C19329Y;
import p999s.InterfaceC19358j;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C19329Y implements InterfaceC18827y, View.OnClickListener, InterfaceC19358j {

    /* JADX INFO: renamed from: A0 */
    public AbstractC18805c f32144A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f32145B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f32146C0;

    /* JADX INFO: renamed from: D0 */
    public final int f32147D0;

    /* JADX INFO: renamed from: E0 */
    public int f32148E0;

    /* JADX INFO: renamed from: F0 */
    public final int f32149F0;

    /* JADX INFO: renamed from: v0 */
    public C18816n f32150v0;

    /* JADX INFO: renamed from: w0 */
    public CharSequence f32151w0;

    /* JADX INFO: renamed from: x0 */
    public Drawable f32152x0;

    /* JADX INFO: renamed from: y0 */
    public InterfaceC18813k f32153y0;

    /* JADX INFO: renamed from: z0 */
    public C18804b f32154z0;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f32145B0 = m11127h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC17123a.f54734c, 0, 0);
        this.f32147D0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f32149F0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f32148E0 = -1;
        setSaveEnabled(false);
    }

    @Override // p999s.InterfaceC19358j
    /* JADX INFO: renamed from: a */
    public final boolean mo11124a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p999s.InterfaceC19358j
    /* JADX INFO: renamed from: b */
    public final boolean mo11125b() {
        return !TextUtils.isEmpty(getText()) && this.f32150v0.getIcon() == null;
    }

    @Override // p976r.InterfaceC18827y
    /* JADX INFO: renamed from: c */
    public final void mo11126c(C18816n c18816n) {
        this.f32150v0 = c18816n;
        setIcon(c18816n.getIcon());
        setTitle(c18816n.getTitleCondensed());
        setId(c18816n.f59875a);
        setVisibility(c18816n.isVisible() ? 0 : 8);
        setEnabled(c18816n.isEnabled());
        if (c18816n.hasSubMenu() && this.f32154z0 == null) {
            this.f32154z0 = new C18804b(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p976r.InterfaceC18827y
    public C18816n getItemData() {
        return this.f32150v0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m11127h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* JADX INFO: renamed from: i */
    public final void m11128i() {
        boolean z6 = true;
        boolean z10 = !TextUtils.isEmpty(this.f32151w0);
        if (this.f32152x0 != null && ((this.f32150v0.f59899y & 4) != 4 || (!this.f32145B0 && !this.f32146C0))) {
            z6 = false;
        }
        boolean z11 = z10 & z6;
        setText(z11 ? this.f32151w0 : null);
        CharSequence charSequence = this.f32150v0.f59891q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z11 ? null : this.f32150v0.f59879e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f32150v0.f59892r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC8194t0.m8797c(this, z11 ? null : this.f32150v0.f59879e);
        } else {
            AbstractC8194t0.m8797c(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC18813k interfaceC18813k = this.f32153y0;
        if (interfaceC18813k != null) {
            interfaceC18813k.mo11129a(this.f32150v0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f32145B0 = m11127h();
        m11128i();
    }

    @Override // p999s.C19329Y, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i12 = this.f32148E0) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.f32147D0;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i13) : i13;
        if (mode != 1073741824 && i13 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (!zIsEmpty || this.f32152x0 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f32152x0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C18804b c18804b;
        if (this.f32150v0.hasSubMenu() && (c18804b = this.f32154z0) != null && c18804b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z6) {
    }

    public void setChecked(boolean z6) {
    }

    public void setExpandedFormat(boolean z6) {
        if (this.f32146C0 != z6) {
            this.f32146C0 = z6;
            C18816n c18816n = this.f32150v0;
            if (c18816n != null) {
                MenuC18814l menuC18814l = c18816n.f59888n;
                menuC18814l.f59855k = true;
                menuC18814l.m20127p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f32152x0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f32149F0;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        m11128i();
    }

    public void setItemInvoker(InterfaceC18813k interfaceC18813k) {
        this.f32153y0 = interfaceC18813k;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f32148E0 = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(AbstractC18805c abstractC18805c) {
        this.f32144A0 = abstractC18805c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f32151w0 = charSequence;
        m11128i();
    }
}
