package p298Lm;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: Lm.C0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5133C0 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f16768a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static final RuntimeModuleData m5682a(Class cls) {
        AbstractC16544l.m18094g(cls, "<this>");
        ClassLoader safeClassLoader = ReflectClassUtilKt.getSafeClassLoader(cls);
        C5149K0 c5149k0 = new C5149K0(safeClassLoader);
        ConcurrentHashMap concurrentHashMap = f16768a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(c5149k0);
        if (weakReference != null) {
            RuntimeModuleData runtimeModuleData = (RuntimeModuleData) weakReference.get();
            if (runtimeModuleData != null) {
                return runtimeModuleData;
            }
            concurrentHashMap.remove(c5149k0, weakReference);
        }
        RuntimeModuleData runtimeModuleDataCreate = RuntimeModuleData.Companion.create(safeClassLoader);
        while (true) {
            WeakReference weakReference2 = (WeakReference) concurrentHashMap.putIfAbsent(c5149k0, new WeakReference(runtimeModuleDataCreate));
            if (weakReference2 == null) {
                return runtimeModuleDataCreate;
            }
            RuntimeModuleData runtimeModuleData2 = (RuntimeModuleData) weakReference2.get();
            if (runtimeModuleData2 != null) {
                return runtimeModuleData2;
            }
            concurrentHashMap.remove(c5149k0, weakReference2);
        }
    }
}
