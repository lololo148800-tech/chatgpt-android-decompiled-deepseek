package p189Ha;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p720e6.C13287b;
import p720e6.C13288c;
import p862l2.C16806e;

/* JADX INFO: renamed from: Ha.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3269c implements Handler.Callback {
    /* JADX WARN: Code duplicated, block: B:22:0x0094  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int height = 0;
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            AbstractC3276j abstractC3276j = (AbstractC3276j) message.obj;
            int i11 = message.arg1;
            AccessibilityManager accessibilityManager = abstractC3276j.f9991v;
            if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
                abstractC3276j.m4152c();
            } else {
                AbstractC3275i abstractC3275i = abstractC3276j.f9978i;
                if (abstractC3275i.getVisibility() != 0) {
                    abstractC3276j.m4152c();
                } else if (abstractC3275i.getAnimationMode() == 1) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat.setInterpolator(abstractC3276j.f9973d);
                    valueAnimatorOfFloat.addUpdateListener(new C3268b(abstractC3276j, 0, (byte) 0));
                    valueAnimatorOfFloat.setDuration(abstractC3276j.f9971b);
                    valueAnimatorOfFloat.addListener(new C3267a(abstractC3276j, i11, 0));
                    valueAnimatorOfFloat.start();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    int height2 = abstractC3275i.getHeight();
                    ViewGroup.LayoutParams layoutParams = abstractC3275i.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        height2 += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    }
                    valueAnimator.setIntValues(0, height2);
                    valueAnimator.setInterpolator(abstractC3276j.f9974e);
                    valueAnimator.setDuration(abstractC3276j.f9972c);
                    valueAnimator.addListener(new C3267a(abstractC3276j, i11, 2));
                    valueAnimator.addUpdateListener(new C3268b(abstractC3276j, 3, (byte) 0));
                    valueAnimator.start();
                }
            }
            return true;
        }
        AbstractC3276j abstractC3276j2 = (AbstractC3276j) message.obj;
        AbstractC3275i abstractC3275i2 = abstractC3276j2.f9978i;
        if (abstractC3275i2.getParent() == null) {
            ViewGroup.LayoutParams layoutParams2 = abstractC3275i2.getLayoutParams();
            if (layoutParams2 instanceof C16806e) {
                C16806e c16806e = (C16806e) layoutParams2;
                BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                C13288c c13288c = baseTransientBottomBar$Behavior.f36698i;
                c13288c.getClass();
                c13288c.f42001Y = abstractC3276j2.f9992w;
                baseTransientBottomBar$Behavior.f36404b = new C13287b(abstractC3276j2, 12);
                c16806e.m18560b(baseTransientBottomBar$Behavior);
                if (abstractC3276j2.m4151b() == null) {
                    c16806e.f53923g = 80;
                }
            }
            abstractC3275i2.f9963y0 = true;
            ViewGroup viewGroup = abstractC3276j2.f9976g;
            viewGroup.addView(abstractC3275i2);
            abstractC3275i2.f9963y0 = false;
            if (abstractC3276j2.m4151b() != null) {
                int[] iArr = new int[2];
                abstractC3276j2.m4151b().getLocationOnScreen(iArr);
                int i12 = iArr[1];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                height = (viewGroup.getHeight() + iArr2[1]) - i12;
            }
            abstractC3276j2.f9986q = height;
            abstractC3276j2.m4155f();
            abstractC3275i2.setVisibility(4);
        }
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        if (abstractC3275i2.isLaidOut()) {
            abstractC3276j2.m4154e();
        } else {
            abstractC3276j2.f9989t = true;
        }
        return true;
    }
}
