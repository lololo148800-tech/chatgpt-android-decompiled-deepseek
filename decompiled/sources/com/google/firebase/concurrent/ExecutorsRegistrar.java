package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import lb.InterfaceC16837a;
import lb.InterfaceC16838b;
import lb.InterfaceC16839c;
import lb.InterfaceC16840d;
import p117Eb.C2382l;
import p331N6.C5676a;
import p571X9.AbstractC9162L;
import p849k7.C16349b;
import p890mb.C17204a;
import p890mb.C17216m;
import p890mb.C17220q;

/* JADX INFO: loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a */
    public static final C17216m f36842a = new C17216m(new C2382l(3));

    /* JADX INFO: renamed from: b */
    public static final C17216m f36843b = new C17216m(new C2382l(4));

    /* JADX INFO: renamed from: c */
    public static final C17216m f36844c = new C17216m(new C2382l(5));

    /* JADX INFO: renamed from: d */
    public static final C17216m f36845d = new C17216m(new C2382l(6));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C17220q c17220q = new C17220q(InterfaceC16837a.class, ScheduledExecutorService.class);
        C17220q[] c17220qArr = {new C17220q(InterfaceC16837a.class, ExecutorService.class), new C17220q(InterfaceC16837a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(c17220q);
        for (C17220q c17220q2 : c17220qArr) {
            AbstractC9162L.m9711a(c17220q2, "Null interface");
        }
        Collections.addAll(hashSet, c17220qArr);
        C17204a c17204a = new C17204a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C16349b(8), hashSet3);
        C17220q c17220q3 = new C17220q(InterfaceC16838b.class, ScheduledExecutorService.class);
        C17220q[] c17220qArr2 = {new C17220q(InterfaceC16838b.class, ExecutorService.class), new C17220q(InterfaceC16838b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(c17220q3);
        for (C17220q c17220q4 : c17220qArr2) {
            AbstractC9162L.m9711a(c17220q4, "Null interface");
        }
        Collections.addAll(hashSet4, c17220qArr2);
        C17204a c17204a2 = new C17204a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new C16349b(9), hashSet6);
        C17220q c17220q5 = new C17220q(InterfaceC16839c.class, ScheduledExecutorService.class);
        C17220q[] c17220qArr3 = {new C17220q(InterfaceC16839c.class, ExecutorService.class), new C17220q(InterfaceC16839c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(c17220q5);
        for (C17220q c17220q6 : c17220qArr3) {
            AbstractC9162L.m9711a(c17220q6, "Null interface");
        }
        Collections.addAll(hashSet7, c17220qArr3);
        C17204a c17204a3 = new C17204a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new C16349b(10), hashSet9);
        C5676a c5676aM18943b = C17204a.m18943b(new C17220q(InterfaceC16840d.class, Executor.class));
        c5676aM18943b.f18435f = new C16349b(11);
        return Arrays.asList(c17204a, c17204a2, c17204a3, c5676aM18943b.m6109e());
    }
}
