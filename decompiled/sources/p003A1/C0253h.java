package p003A1;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: A1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0253h implements InterfaceC0250g {

    /* JADX INFO: renamed from: a */
    public final AccessibilityManager f957a;

    public C0253h(Context context) {
        Object systemService = context.getSystemService("accessibility");
        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f957a = (AccessibilityManager) systemService;
    }
}
