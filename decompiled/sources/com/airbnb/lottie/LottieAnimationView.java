package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.openai.chatgpt.R;
import io.sentry.internal.debugmeta.C15384c;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import p111E5.CallableC2341y;
import p117Eb.C2392v;
import p117Eb.CallableC2378h;
import p329N3.RunnableC5611a;
import p520V5.AbstractC7768F;
import p520V5.AbstractC7771I;
import p520V5.AbstractC7773b;
import p520V5.AbstractC7785n;
import p520V5.C7764B;
import p520V5.C7766D;
import p520V5.C7767E;
import p520V5.C7770H;
import p520V5.C7775d;
import p520V5.C7777f;
import p520V5.C7778g;
import p520V5.C7780i;
import p520V5.C7781j;
import p520V5.C7789r;
import p520V5.C7794w;
import p520V5.CallableC7776e;
import p520V5.CallableC7782k;
import p520V5.EnumC7769G;
import p520V5.EnumC7772a;
import p520V5.EnumC7779h;
import p520V5.EnumC7795x;
import p520V5.InterfaceC7763A;
import p520V5.InterfaceC7774c;
import p520V5.InterfaceC7793v;
import p520V5.InterfaceC7797z;
import p571X9.AbstractC9306j0;
import p614Z5.C10166a;
import p640a6.C10510e;
import p698d6.C13030c;
import p730ek.C13438c;
import p779h6.AbstractC14417f;
import p779h6.ChoreographerFrameCallbackC14415d;
import p802i6.InterfaceC14937c;
import p913o2.AbstractC17803d;
import p999s.C19382v;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends C19382v {

    /* JADX INFO: renamed from: E0 */
    public static final C7775d f35927E0 = new C7775d();

    /* JADX INFO: renamed from: A0 */
    public boolean f35928A0;

    /* JADX INFO: renamed from: B0 */
    public final HashSet f35929B0;

    /* JADX INFO: renamed from: C0 */
    public final HashSet f35930C0;

    /* JADX INFO: renamed from: D0 */
    public C7766D f35931D0;

    /* JADX INFO: renamed from: r0 */
    public final C7780i f35932r0;

    /* JADX INFO: renamed from: s0 */
    public final C7780i f35933s0;

    /* JADX INFO: renamed from: t0 */
    public InterfaceC7797z f35934t0;

    /* JADX INFO: renamed from: u0 */
    public int f35935u0;

    /* JADX INFO: renamed from: v0 */
    public final C7794w f35936v0;

    /* JADX INFO: renamed from: w0 */
    public String f35937w0;

    /* JADX INFO: renamed from: x0 */
    public int f35938x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f35939y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f35940z0;

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        String string;
        super(context, attributeSet, 0);
        this.f35932r0 = new C7780i(this, 1);
        this.f35933s0 = new C7780i(this, 0);
        this.f35935u0 = 0;
        C7794w c7794w = new C7794w();
        this.f35936v0 = c7794w;
        this.f35939y0 = false;
        this.f35940z0 = false;
        this.f35928A0 = true;
        HashSet hashSet = new HashSet();
        this.f35929B0 = hashSet;
        this.f35930C0 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC7768F.f24551a, R.attr.lottieAnimationViewStyle, 0);
        this.f35928A0 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(9);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(19);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(14, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(9);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(19)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(8, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(1, false)) {
            this.f35940z0 = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(12, false)) {
            c7794w.f24660Z.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(17, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(16, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(18, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(4, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(3, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(6));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(11));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(13);
        float f10 = typedArrayObtainStyledAttributes.getFloat(13, 0.0f);
        if (zHasValue4) {
            hashSet.add(EnumC7779h.f24572Z);
        }
        c7794w.m8072t(f10);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(7, false);
        EnumC7795x enumC7795x = EnumC7795x.f24677Y;
        HashSet hashSet2 = (HashSet) c7794w.f24674x0.f59414Z;
        boolean zAdd = z6 ? hashSet2.add(enumC7795x) : hashSet2.remove(enumC7795x);
        if (c7794w.f24658Y != null && zAdd) {
            c7794w.m8056c();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            c7794w.m8054a(new C10510e("**"), InterfaceC7763A.f24507F, new C15384c(new C7770H(AbstractC17803d.m19556c(getContext(), typedArrayObtainStyledAttributes.getResourceId(5, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            int i10 = typedArrayObtainStyledAttributes.getInt(15, 0);
            setRenderMode(EnumC7769G.values()[i10 >= EnumC7769G.values().length ? 0 : i10]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            int i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
            setAsyncUpdates(EnumC7772a.values()[i11 >= EnumC7769G.values().length ? 0 : i11]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(10, false));
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(20, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setCompositionTask(C7766D c7766d) {
        C7764B c7764b = c7766d.f24547d;
        C7794w c7794w = this.f35936v0;
        if (c7764b != null && c7794w == getDrawable() && c7794w.f24658Y == c7764b.f24539a) {
            return;
        }
        this.f35929B0.add(EnumC7779h.f24571Y);
        this.f35936v0.m8057d();
        m13143e();
        c7766d.m8033b(this.f35932r0);
        c7766d.m8032a(this.f35933s0);
        this.f35931D0 = c7766d;
    }

    /* JADX INFO: renamed from: c */
    public final void m13141c(C13438c c13438c) {
        if (getComposition() != null) {
            c13438c.m14966a();
        }
        this.f35930C0.add(c13438c);
    }

    /* JADX INFO: renamed from: d */
    public final void m13142d(C10510e c10510e, Integer num, InterfaceC14937c interfaceC14937c) {
        this.f35936v0.m8054a(c10510e, num, new C7777f(interfaceC14937c, 0));
    }

    /* JADX INFO: renamed from: e */
    public final void m13143e() {
        C7766D c7766d = this.f35931D0;
        if (c7766d != null) {
            C7780i c7780i = this.f35932r0;
            synchronized (c7766d) {
                c7766d.f24544a.remove(c7780i);
            }
            this.f35931D0.m8036e(this.f35933s0);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m13144f() {
        this.f35929B0.add(EnumC7779h.f24576r0);
        this.f35936v0.m8063k();
    }

    /* JADX INFO: renamed from: g */
    public final void m13145g() {
        C7794w c7794w = this.f35936v0;
        ChoreographerFrameCallbackC14415d choreographerFrameCallbackC14415d = c7794w.f24660Z;
        choreographerFrameCallbackC14415d.removeAllUpdateListeners();
        choreographerFrameCallbackC14415d.addUpdateListener(c7794w.f24656W0);
    }

    public EnumC7772a getAsyncUpdates() {
        EnumC7772a enumC7772a = this.f35936v0.f24655V0;
        return enumC7772a != null ? enumC7772a : EnumC7772a.f24556Y;
    }

    public boolean getAsyncUpdatesEnabled() {
        EnumC7772a enumC7772a = this.f35936v0.f24655V0;
        if (enumC7772a == null) {
            enumC7772a = EnumC7772a.f24556Y;
        }
        return enumC7772a == EnumC7772a.f24557Z;
    }

    public boolean getClipTextToBoundingBox() {
        return this.f35936v0.f24639F0;
    }

    public boolean getClipToCompositionBounds() {
        return this.f35936v0.f24676z0;
    }

    public C7781j getComposition() {
        Drawable drawable = getDrawable();
        C7794w c7794w = this.f35936v0;
        if (drawable == c7794w) {
            return c7794w.f24658Y;
        }
        return null;
    }

    public long getDuration() {
        C7781j composition = getComposition();
        if (composition != null) {
            return (long) composition.m8040b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f35936v0.f24660Z.f45299t0;
    }

    public String getImageAssetsFolder() {
        return this.f35936v0.f24670t0;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f35936v0.f24675y0;
    }

    public float getMaxFrame() {
        return this.f35936v0.f24660Z.m15916b();
    }

    public float getMinFrame() {
        return this.f35936v0.f24660Z.m15917c();
    }

    public C7767E getPerformanceTracker() {
        C7781j c7781j = this.f35936v0.f24658Y;
        if (c7781j != null) {
            return c7781j.f24580a;
        }
        return null;
    }

    public float getProgress() {
        return this.f35936v0.f24660Z.m15915a();
    }

    public EnumC7769G getRenderMode() {
        return this.f35936v0.f24641H0 ? EnumC7769G.f24554o0 : EnumC7769G.f24553Z;
    }

    public int getRepeatCount() {
        return this.f35936v0.f24660Z.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f35936v0.f24660Z.getRepeatMode();
    }

    public float getSpeed() {
        return this.f35936v0.f24660Z.f45295p0;
    }

    /* JADX INFO: renamed from: h */
    public final void m13146h(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(AbstractC7785n.m8043a(null, new CallableC2341y(byteArrayInputStream, 1), new RunnableC5611a(byteArrayInputStream, 13)));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof C7794w) {
            boolean z6 = ((C7794w) drawable).f24641H0;
            EnumC7769G enumC7769G = EnumC7769G.f24554o0;
            if ((z6 ? enumC7769G : EnumC7769G.f24553Z) == enumC7769G) {
                this.f35936v0.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C7794w c7794w = this.f35936v0;
        if (drawable2 == c7794w) {
            super.invalidateDrawable(c7794w);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f35940z0) {
            return;
        }
        this.f35936v0.m8063k();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof C7778g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7778g c7778g = (C7778g) parcelable;
        super.onRestoreInstanceState(c7778g.getSuperState());
        this.f35937w0 = c7778g.f24564Y;
        HashSet hashSet = this.f35929B0;
        EnumC7779h enumC7779h = EnumC7779h.f24571Y;
        if (!hashSet.contains(enumC7779h) && !TextUtils.isEmpty(this.f35937w0)) {
            setAnimation(this.f35937w0);
        }
        this.f35938x0 = c7778g.f24565Z;
        if (!hashSet.contains(enumC7779h) && (i10 = this.f35938x0) != 0) {
            setAnimation(i10);
        }
        if (!hashSet.contains(EnumC7779h.f24572Z)) {
            this.f35936v0.m8072t(c7778g.f24566o0);
        }
        if (!hashSet.contains(EnumC7779h.f24576r0) && c7778g.f24567p0) {
            m13144f();
        }
        if (!hashSet.contains(EnumC7779h.f24575q0)) {
            setImageAssetsFolder(c7778g.f24568q0);
        }
        if (!hashSet.contains(EnumC7779h.f24573o0)) {
            setRepeatMode(c7778g.f24569r0);
        }
        if (hashSet.contains(EnumC7779h.f24574p0)) {
            return;
        }
        setRepeatCount(c7778g.f24570s0);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z6;
        C7778g c7778g = new C7778g(super.onSaveInstanceState());
        c7778g.f24564Y = this.f35937w0;
        c7778g.f24565Z = this.f35938x0;
        C7794w c7794w = this.f35936v0;
        c7778g.f24566o0 = c7794w.f24660Z.m15915a();
        boolean zIsVisible = c7794w.isVisible();
        ChoreographerFrameCallbackC14415d choreographerFrameCallbackC14415d = c7794w.f24660Z;
        if (zIsVisible) {
            z6 = choreographerFrameCallbackC14415d.f45304y0;
        } else {
            int i10 = c7794w.f24664c1;
            z6 = i10 == 2 || i10 == 3;
        }
        c7778g.f24567p0 = z6;
        c7778g.f24568q0 = c7794w.f24670t0;
        c7778g.f24569r0 = choreographerFrameCallbackC14415d.getRepeatMode();
        c7778g.f24570s0 = choreographerFrameCallbackC14415d.getRepeatCount();
        return c7778g;
    }

    public void setAnimation(final int i10) {
        C7766D c7766dM8043a;
        C7766D c7766d;
        this.f35938x0 = i10;
        final String str = null;
        this.f35937w0 = null;
        if (isInEditMode()) {
            c7766d = new C7766D(new CallableC7776e(this, i10, 0), true);
        } else {
            if (this.f35928A0) {
                Context context = getContext();
                final String strM8052j = AbstractC7785n.m8052j(context, i10);
                final WeakReference weakReference = new WeakReference(context);
                final Context applicationContext = context.getApplicationContext();
                c7766dM8043a = AbstractC7785n.m8043a(strM8052j, new Callable() { // from class: V5.m
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Context context2 = (Context) weakReference.get();
                        if (context2 == null) {
                            context2 = applicationContext;
                        }
                        return AbstractC7785n.m8047e(i10, context2, strM8052j);
                    }
                }, null);
            } else {
                Context context2 = getContext();
                HashMap map = AbstractC7785n.f24607a;
                final WeakReference weakReference2 = new WeakReference(context2);
                final Context applicationContext2 = context2.getApplicationContext();
                c7766dM8043a = AbstractC7785n.m8043a(null, new Callable() { // from class: V5.m
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Context context3 = (Context) weakReference2.get();
                        if (context3 == null) {
                            context3 = applicationContext2;
                        }
                        return AbstractC7785n.m8047e(i10, context3, str);
                    }
                }, null);
            }
            c7766d = c7766dM8043a;
        }
        setCompositionTask(c7766d);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        m13146h(str);
    }

    public void setAnimationFromUrl(String str) {
        C7766D c7766dM8043a;
        int i10 = 0;
        String str2 = null;
        if (this.f35928A0) {
            Context context = getContext();
            HashMap map = AbstractC7785n.f24607a;
            String strM9889h = AbstractC9306j0.m9889h("url_", str);
            c7766dM8043a = AbstractC7785n.m8043a(strM9889h, new CallableC7782k(context, str, strM9889h, i10), null);
        } else {
            c7766dM8043a = AbstractC7785n.m8043a(null, new CallableC7782k(getContext(), str, str2, i10), null);
        }
        setCompositionTask(c7766dM8043a);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z6) {
        this.f35936v0.f24638E0 = z6;
    }

    public void setAsyncUpdates(EnumC7772a enumC7772a) {
        this.f35936v0.f24655V0 = enumC7772a;
    }

    public void setCacheComposition(boolean z6) {
        this.f35928A0 = z6;
    }

    public void setClipTextToBoundingBox(boolean z6) {
        C7794w c7794w = this.f35936v0;
        if (z6 != c7794w.f24639F0) {
            c7794w.f24639F0 = z6;
            c7794w.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z6) {
        C7794w c7794w = this.f35936v0;
        if (z6 != c7794w.f24676z0) {
            c7794w.f24676z0 = z6;
            C13030c c13030c = c7794w.f24634A0;
            if (c13030c != null) {
                c13030c.f41367J = z6;
            }
            c7794w.invalidateSelf();
        }
    }

    public void setComposition(C7781j c7781j) {
        C7794w c7794w = this.f35936v0;
        c7794w.setCallback(this);
        boolean z6 = true;
        this.f35939y0 = true;
        C7781j c7781j2 = c7794w.f24658Y;
        ChoreographerFrameCallbackC14415d choreographerFrameCallbackC14415d = c7794w.f24660Z;
        if (c7781j2 == c7781j) {
            z6 = false;
        } else {
            c7794w.f24654U0 = true;
            c7794w.m8057d();
            c7794w.f24658Y = c7781j;
            c7794w.m8056c();
            boolean z10 = choreographerFrameCallbackC14415d.f45303x0 == null;
            choreographerFrameCallbackC14415d.f45303x0 = c7781j;
            if (z10) {
                choreographerFrameCallbackC14415d.m15923i(Math.max(choreographerFrameCallbackC14415d.f45301v0, c7781j.f24591l), Math.min(choreographerFrameCallbackC14415d.f45302w0, c7781j.f24592m));
            } else {
                choreographerFrameCallbackC14415d.m15923i((int) c7781j.f24591l, (int) c7781j.f24592m);
            }
            float f10 = choreographerFrameCallbackC14415d.f45299t0;
            choreographerFrameCallbackC14415d.f45299t0 = 0.0f;
            choreographerFrameCallbackC14415d.f45298s0 = 0.0f;
            choreographerFrameCallbackC14415d.m15922h((int) f10);
            choreographerFrameCallbackC14415d.m15920f();
            c7794w.m8072t(choreographerFrameCallbackC14415d.getAnimatedFraction());
            ArrayList arrayList = c7794w.f24668r0;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                InterfaceC7793v interfaceC7793v = (InterfaceC7793v) it.next();
                if (interfaceC7793v != null) {
                    interfaceC7793v.run();
                }
                it.remove();
            }
            arrayList.clear();
            c7781j.f24580a.f24548a = c7794w.f24636C0;
            c7794w.m8058e();
            Drawable.Callback callback = c7794w.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(c7794w);
            }
        }
        if (this.f35940z0) {
            c7794w.m8063k();
        }
        this.f35939y0 = false;
        if (getDrawable() != c7794w || z6) {
            if (!z6) {
                boolean z11 = choreographerFrameCallbackC14415d != null ? choreographerFrameCallbackC14415d.f45304y0 : false;
                setImageDrawable(null);
                setImageDrawable(c7794w);
                if (z11) {
                    c7794w.m8065m();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.f35930C0.iterator();
            while (it2.hasNext()) {
                ((C13438c) it2.next()).m14966a();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        C7794w c7794w = this.f35936v0;
        c7794w.f24673w0 = str;
        C2392v c2392vM8061i = c7794w.m8061i();
        if (c2392vM8061i != null) {
            c2392vM8061i.f7437o0 = str;
        }
    }

    public void setFailureListener(InterfaceC7797z interfaceC7797z) {
        this.f35934t0 = interfaceC7797z;
    }

    public void setFallbackResource(int i10) {
        this.f35935u0 = i10;
    }

    public void setFontAssetDelegate(AbstractC7773b abstractC7773b) {
        C2392v c2392v = this.f35936v0.f24671u0;
    }

    public void setFontMap(Map<String, Typeface> map) {
        C7794w c7794w = this.f35936v0;
        if (map == c7794w.f24672v0) {
            return;
        }
        c7794w.f24672v0 = map;
        c7794w.invalidateSelf();
    }

    public void setFrame(int i10) {
        this.f35936v0.m8066n(i10);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z6) {
        this.f35936v0.f24666p0 = z6;
    }

    public void setImageAssetDelegate(InterfaceC7774c interfaceC7774c) {
        C10166a c10166a = this.f35936v0.f24669s0;
    }

    public void setImageAssetsFolder(String str) {
        this.f35936v0.f24670t0 = str;
    }

    @Override // p999s.C19382v, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f35938x0 = 0;
        this.f35937w0 = null;
        m13143e();
        super.setImageBitmap(bitmap);
    }

    @Override // p999s.C19382v, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f35938x0 = 0;
        this.f35937w0 = null;
        m13143e();
        super.setImageDrawable(drawable);
    }

    @Override // p999s.C19382v, android.widget.ImageView
    public void setImageResource(int i10) {
        this.f35938x0 = 0;
        this.f35937w0 = null;
        m13143e();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z6) {
        this.f35936v0.f24675y0 = z6;
    }

    public void setMaxFrame(int i10) {
        this.f35936v0.m8067o(i10);
    }

    public void setMaxProgress(float f10) {
        C7794w c7794w = this.f35936v0;
        C7781j c7781j = c7794w.f24658Y;
        if (c7781j == null) {
            c7794w.f24668r0.add(new C7789r(c7794w, f10, 0));
            return;
        }
        float fM15928e = AbstractC14417f.m15928e(c7781j.f24591l, c7781j.f24592m, f10);
        ChoreographerFrameCallbackC14415d choreographerFrameCallbackC14415d = c7794w.f24660Z;
        choreographerFrameCallbackC14415d.m15923i(choreographerFrameCallbackC14415d.f45301v0, fM15928e);
    }

    public void setMinAndMaxFrame(String str) {
        this.f35936v0.m8069q(str);
    }

    public void setMinFrame(int i10) {
        this.f35936v0.m8070r(i10);
    }

    public void setMinProgress(float f10) {
        C7794w c7794w = this.f35936v0;
        C7781j c7781j = c7794w.f24658Y;
        if (c7781j == null) {
            c7794w.f24668r0.add(new C7789r(c7794w, f10, 1));
        } else {
            c7794w.m8070r((int) AbstractC14417f.m15928e(c7781j.f24591l, c7781j.f24592m, f10));
        }
    }

    public void setOutlineMasksAndMattes(boolean z6) {
        C7794w c7794w = this.f35936v0;
        if (c7794w.f24637D0 == z6) {
            return;
        }
        c7794w.f24637D0 = z6;
        C13030c c13030c = c7794w.f24634A0;
        if (c13030c != null) {
            c13030c.mo14782r(z6);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z6) {
        C7794w c7794w = this.f35936v0;
        c7794w.f24636C0 = z6;
        C7781j c7781j = c7794w.f24658Y;
        if (c7781j != null) {
            c7781j.f24580a.f24548a = z6;
        }
    }

    public void setProgress(float f10) {
        this.f35929B0.add(EnumC7779h.f24572Z);
        this.f35936v0.m8072t(f10);
    }

    public void setRenderMode(EnumC7769G enumC7769G) {
        C7794w c7794w = this.f35936v0;
        c7794w.f24640G0 = enumC7769G;
        c7794w.m8058e();
    }

    public void setRepeatCount(int i10) {
        this.f35929B0.add(EnumC7779h.f24574p0);
        this.f35936v0.f24660Z.setRepeatCount(i10);
    }

    public void setRepeatMode(int i10) {
        this.f35929B0.add(EnumC7779h.f24573o0);
        this.f35936v0.f24660Z.setRepeatMode(i10);
    }

    public void setSafeMode(boolean z6) {
        this.f35936v0.f24667q0 = z6;
    }

    public void setSpeed(float f10) {
        this.f35936v0.f24660Z.f45295p0 = f10;
    }

    public void setTextDelegate(AbstractC7771I abstractC7771I) {
        this.f35936v0.getClass();
    }

    public void setUseCompositionFrameRate(boolean z6) {
        this.f35936v0.f24660Z.f45305z0 = z6;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        C7794w c7794w;
        ChoreographerFrameCallbackC14415d choreographerFrameCallbackC14415d;
        C7794w c7794w2;
        boolean z6 = this.f35939y0;
        if (!z6 && drawable == (c7794w2 = this.f35936v0)) {
            ChoreographerFrameCallbackC14415d choreographerFrameCallbackC14415d2 = c7794w2.f24660Z;
            if (choreographerFrameCallbackC14415d2 == null ? false : choreographerFrameCallbackC14415d2.f45304y0) {
                this.f35940z0 = false;
                c7794w2.m8062j();
            } else if (!z6) {
                c7794w = (C7794w) drawable;
                choreographerFrameCallbackC14415d = c7794w.f24660Z;
                if (choreographerFrameCallbackC14415d != null ? choreographerFrameCallbackC14415d.f45304y0 : false) {
                    c7794w.m8062j();
                }
            }
        } else if (!z6 && (drawable instanceof C7794w)) {
            c7794w = (C7794w) drawable;
            choreographerFrameCallbackC14415d = c7794w.f24660Z;
            if (choreographerFrameCallbackC14415d != null ? choreographerFrameCallbackC14415d.f45304y0 : false) {
                c7794w.m8062j();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f35936v0.m8068p(str);
    }

    public void setMinFrame(String str) {
        this.f35936v0.m8071s(str);
    }

    public void setAnimation(String str) {
        C7766D c7766dM8043a;
        C7766D c7766d;
        int i10 = 1;
        this.f35937w0 = str;
        this.f35938x0 = 0;
        if (isInEditMode()) {
            c7766d = new C7766D(new CallableC2378h(this, i10, str), true);
        } else {
            String str2 = null;
            if (this.f35928A0) {
                Context context = getContext();
                HashMap map = AbstractC7785n.f24607a;
                String strM9889h = AbstractC9306j0.m9889h("asset_", str);
                c7766dM8043a = AbstractC7785n.m8043a(strM9889h, new CallableC7782k(context.getApplicationContext(), str, strM9889h, i10), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = AbstractC7785n.f24607a;
                c7766dM8043a = AbstractC7785n.m8043a(null, new CallableC7782k(context2.getApplicationContext(), str, str2, i10), null);
            }
            c7766d = c7766dM8043a;
        }
        setCompositionTask(c7766d);
    }
}
