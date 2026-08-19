package p140Fa;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p523V9.AbstractC8143m5;
import p523V9.AbstractC8151n5;
import p783ha.AbstractC14431a;

/* JADX INFO: renamed from: Fa.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2691k {

    /* JADX INFO: renamed from: m */
    public static final C2688h f8273m = new C2688h(0.5f);

    /* JADX INFO: renamed from: a */
    public AbstractC8143m5 f8274a = new C2689i();

    /* JADX INFO: renamed from: b */
    public AbstractC8143m5 f8275b = new C2689i();

    /* JADX INFO: renamed from: c */
    public AbstractC8143m5 f8276c = new C2689i();

    /* JADX INFO: renamed from: d */
    public AbstractC8143m5 f8277d = new C2689i();

    /* JADX INFO: renamed from: e */
    public InterfaceC2683c f8278e = new C2681a(0.0f);

    /* JADX INFO: renamed from: f */
    public InterfaceC2683c f8279f = new C2681a(0.0f);

    /* JADX INFO: renamed from: g */
    public InterfaceC2683c f8280g = new C2681a(0.0f);

    /* JADX INFO: renamed from: h */
    public InterfaceC2683c f8281h = new C2681a(0.0f);

    /* JADX INFO: renamed from: i */
    public C2685e f8282i = new C2685e();

    /* JADX INFO: renamed from: j */
    public C2685e f8283j = new C2685e();

    /* JADX INFO: renamed from: k */
    public C2685e f8284k = new C2685e();

    /* JADX INFO: renamed from: l */
    public C2685e f8285l = new C2685e();

    /* JADX INFO: renamed from: a */
    public static C2690j m3690a(Context context, int i10, int i11, InterfaceC2683c interfaceC2683c) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC14431a.f45360A);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(3, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(4, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(2, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(1, i12);
            InterfaceC2683c interfaceC2683cM3692c = m3692c(typedArrayObtainStyledAttributes, 5, interfaceC2683c);
            InterfaceC2683c interfaceC2683cM3692c2 = m3692c(typedArrayObtainStyledAttributes, 8, interfaceC2683cM3692c);
            InterfaceC2683c interfaceC2683cM3692c3 = m3692c(typedArrayObtainStyledAttributes, 9, interfaceC2683cM3692c);
            InterfaceC2683c interfaceC2683cM3692c4 = m3692c(typedArrayObtainStyledAttributes, 7, interfaceC2683cM3692c);
            InterfaceC2683c interfaceC2683cM3692c5 = m3692c(typedArrayObtainStyledAttributes, 6, interfaceC2683cM3692c);
            C2690j c2690j = new C2690j(0);
            AbstractC8143m5 abstractC8143m5M8693a = AbstractC8151n5.m8693a(i13);
            c2690j.f8261a = abstractC8143m5M8693a;
            C2690j.m3688b(abstractC8143m5M8693a);
            c2690j.f8265e = interfaceC2683cM3692c2;
            AbstractC8143m5 abstractC8143m5M8693a2 = AbstractC8151n5.m8693a(i14);
            c2690j.f8262b = abstractC8143m5M8693a2;
            C2690j.m3688b(abstractC8143m5M8693a2);
            c2690j.f8266f = interfaceC2683cM3692c3;
            AbstractC8143m5 abstractC8143m5M8693a3 = AbstractC8151n5.m8693a(i15);
            c2690j.f8263c = abstractC8143m5M8693a3;
            C2690j.m3688b(abstractC8143m5M8693a3);
            c2690j.f8267g = interfaceC2683cM3692c4;
            AbstractC8143m5 abstractC8143m5M8693a4 = AbstractC8151n5.m8693a(i16);
            c2690j.f8264d = abstractC8143m5M8693a4;
            C2690j.m3688b(abstractC8143m5M8693a4);
            c2690j.f8268h = interfaceC2683cM3692c5;
            return c2690j;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static C2690j m3691b(Context context, AttributeSet attributeSet, int i10, int i11) {
        C2681a c2681a = new C2681a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14431a.f45388u, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m3690a(context, resourceId, resourceId2, c2681a);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC2683c m3692c(TypedArray typedArray, int i10, InterfaceC2683c interfaceC2683c) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue == null) {
            return interfaceC2683c;
        }
        int i11 = typedValuePeekValue.type;
        if (i11 == 5) {
            return new C2681a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i11 == 6 ? new C2688h(typedValuePeekValue.getFraction(1.0f, 1.0f)) : interfaceC2683c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3693d(RectF rectF) {
        boolean z6 = this.f8285l.getClass().equals(C2685e.class) && this.f8283j.getClass().equals(C2685e.class) && this.f8282i.getClass().equals(C2685e.class) && this.f8284k.getClass().equals(C2685e.class);
        float fMo3657a = this.f8278e.mo3657a(rectF);
        return z6 && ((this.f8279f.mo3657a(rectF) > fMo3657a ? 1 : (this.f8279f.mo3657a(rectF) == fMo3657a ? 0 : -1)) == 0 && (this.f8281h.mo3657a(rectF) > fMo3657a ? 1 : (this.f8281h.mo3657a(rectF) == fMo3657a ? 0 : -1)) == 0 && (this.f8280g.mo3657a(rectF) > fMo3657a ? 1 : (this.f8280g.mo3657a(rectF) == fMo3657a ? 0 : -1)) == 0) && ((this.f8275b instanceof C2689i) && (this.f8274a instanceof C2689i) && (this.f8276c instanceof C2689i) && (this.f8277d instanceof C2689i));
    }

    /* JADX INFO: renamed from: e */
    public final C2690j m3694e() {
        C2690j c2690j = new C2690j();
        c2690j.f8261a = this.f8274a;
        c2690j.f8262b = this.f8275b;
        c2690j.f8263c = this.f8276c;
        c2690j.f8264d = this.f8277d;
        c2690j.f8265e = this.f8278e;
        c2690j.f8266f = this.f8279f;
        c2690j.f8267g = this.f8280g;
        c2690j.f8268h = this.f8281h;
        c2690j.f8269i = this.f8282i;
        c2690j.f8270j = this.f8283j;
        c2690j.f8271k = this.f8284k;
        c2690j.f8272l = this.f8285l;
        return c2690j;
    }
}
