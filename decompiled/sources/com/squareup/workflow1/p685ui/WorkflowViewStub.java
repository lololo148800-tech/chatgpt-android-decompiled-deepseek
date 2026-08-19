package com.squareup.workflow1.p685ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.InterfaceC11112u;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1439n;
import p183H4.InterfaceC3232g;
import p279L1.VOxZ.sVoFrD;
import p482Tg.C7443a0;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC8104h6;
import p544W9.AbstractC8712t;
import p544W9.AbstractC8718u;
import p561X.C8990d;
import p769gj.AbstractC14176r;
import p769gj.C14183y;
import p769gj.InterfaceC14149C;
import p791hj.InterfaceC14521d;
import p791hj.ViewOnAttachStateChangeListenerC14519b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\"\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\u0006R4\u0010+\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, m18067d2 = {"Lcom/squareup/workflow1/ui/WorkflowViewStub;", "Landroid/view/View;", "", ParameterNames.f31999ID, "Lmm/C;", "setId", "(I)V", "visibility", "setVisibility", "getVisibility", "()I", "Landroid/graphics/drawable/Drawable;", "background", "setBackground", "(Landroid/graphics/drawable/Drawable;)V", "<set-?>", "o0", "Landroid/view/View;", "getActual", "()Landroid/view/View;", "actual", "", "p0", "Z", "getUpdatesVisibility", "()Z", "setUpdatesVisibility", "(Z)V", "updatesVisibility", "value", "q0", TokenNames.f32012I, "getInflatedId", "setInflatedId", "inflatedId", "Lkotlin/Function2;", "Landroid/view/ViewGroup;", "r0", "LBm/n;", "getReplaceOldViewInParent", "()LBm/n;", "setReplaceOldViewInParent", "(LBm/n;)V", "replaceOldViewInParent", "wf1-core-android"}, m18068k = 1, m18069mv = {1, 6, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class WorkflowViewStub extends View {

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ int f40523s0 = 0;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public View actual;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public boolean updatesVisibility;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public int inflatedId;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public InterfaceC1439n replaceOldViewInParent;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkflowViewStub(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        AbstractC16544l.m18094g(context, "context");
    }

    public final View getActual() {
        return this.actual;
    }

    public final int getInflatedId() {
        return this.inflatedId;
    }

    public final InterfaceC1439n getReplaceOldViewInParent() {
        return this.replaceOldViewInParent;
    }

    public final boolean getUpdatesVisibility() {
        return this.updatesVisibility;
    }

    @Override // android.view.View
    public int getVisibility() {
        View view = this.actual;
        return (AbstractC16544l.m18089b(view, this) || view == null) ? super.getVisibility() : this.actual.getVisibility();
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
        View view;
        super.setBackground(background);
        if (AbstractC16544l.m18089b(this.actual, this) || (view = this.actual) == null || background == null) {
            return;
        }
        view.setBackground(background);
    }

    @Override // android.view.View
    public void setId(int id2) {
        if (id2 != -1 && id2 == this.inflatedId) {
            throw new IllegalArgumentException(AbstractC16544l.m18100m(getResources().getResourceName(id2), "id must be distinct from inflatedId: ").toString());
        }
        super.setId(id2);
    }

    public final void setInflatedId(int i10) {
        if (i10 != -1 && i10 == getId()) {
            throw new IllegalArgumentException(AbstractC16544l.m18100m(getResources().getResourceName(getId()), "inflatedId must be distinct from id: ").toString());
        }
        this.inflatedId = i10;
    }

    public final void setReplaceOldViewInParent(InterfaceC1439n interfaceC1439n) {
        AbstractC16544l.m18094g(interfaceC1439n, "<set-?>");
        this.replaceOldViewInParent = interfaceC1439n;
    }

    public final void setUpdatesVisibility(boolean z6) {
        this.updatesVisibility = z6;
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        View view;
        super.setVisibility(visibility);
        if (AbstractC16544l.m18089b(this.actual, this) || (view = this.actual) == null) {
            return;
        }
        view.setVisibility(visibility);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WorkflowViewStub(Context context, AttributeSet attributeSet, int i10) {
        attributeSet = (i10 & 2) != 0 ? null : attributeSet;
        AbstractC16544l.m18094g(context, "context");
        super(context, attributeSet, 0, 0);
        this.actual = this;
        this.updatesVisibility = true;
        this.inflatedId = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14176r.f44562a, 0, 0);
        AbstractC16544l.m18093f(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…fStyle, defStyleRes\n    )");
        setInflatedId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        this.updatesVisibility = typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(true);
        this.replaceOldViewInParent = new C7443a0(this, 15);
    }

    /* JADX INFO: renamed from: a */
    public final void m14525a(Object rendering, C14183y viewEnvironment) {
        AbstractC16544l.m18094g(rendering, "rendering");
        AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
        View view = this.actual;
        if (!AbstractC8718u.m9433b(view, rendering)) {
            view = null;
        }
        if (view != null) {
            AbstractC8718u.m9435d(view, rendering, viewEnvironment);
            return;
        }
        ViewParent parent = this.actual.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            throw new IllegalStateException(sVoFrD.FWyWfhEeLpkRtK);
        }
        View view2 = this.actual;
        if (view2 != this) {
            AbstractC16544l.m18094g(view2, "view");
            InterfaceC11112u interfaceC11112uM8090b = AbstractC7841A0.m8090b(view2);
            InterfaceC14521d interfaceC14521d = interfaceC11112uM8090b instanceof InterfaceC14521d ? (InterfaceC14521d) interfaceC11112uM8090b : null;
            if (interfaceC14521d != null) {
                ((ViewOnAttachStateChangeListenerC14519b) interfaceC14521d).m16007b();
            }
        }
        InterfaceC14149C interfaceC14149C = (InterfaceC14149C) viewEnvironment.m15505a(InterfaceC14149C.f44508a);
        Context context = viewGroup.getContext();
        AbstractC16544l.m18093f(context, "parent.context");
        View viewM9421c = AbstractC8712t.m9421c(interfaceC14149C, rendering, viewEnvironment, context, viewGroup, new C8990d(8));
        AbstractC8718u.m9436e(viewM9421c);
        if (getInflatedId() != -1) {
            viewM9421c.setId(getInflatedId());
        }
        if (getUpdatesVisibility()) {
            viewM9421c.setVisibility(getVisibility());
        }
        Drawable background = getBackground();
        if (background != null) {
            viewM9421c.setBackground(background);
        }
        InterfaceC3232g interfaceC3232gM8583b = AbstractC8104h6.m8583b(this);
        ViewParent parent2 = getParent();
        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (interfaceC3232gM8583b != (viewGroup2 != null ? AbstractC8104h6.m8583b(viewGroup2) : null)) {
            AbstractC8104h6.m8585d(viewM9421c, interfaceC3232gM8583b);
        }
        getReplaceOldViewInParent().invoke(viewGroup, viewM9421c);
        this.actual = viewM9421c;
    }
}
