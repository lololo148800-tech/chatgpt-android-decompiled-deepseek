package kotlin.reflect.jvm.internal.impl.util;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AttributeArrayOwner<K, T> extends AbstractArrayMapOwner<K, T> {

    /* JADX INFO: renamed from: Y */
    public ArrayMap f53285Y;

    public AttributeArrayOwner() {
        EmptyArrayMap emptyArrayMap = EmptyArrayMap.INSTANCE;
        AbstractC16544l.m18092e(emptyArrayMap, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this.f53285Y = emptyArrayMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    /* JADX INFO: renamed from: f */
    public final ArrayMap mo18443f() {
        return this.f53285Y;
    }

    /* JADX INFO: renamed from: m */
    public final String m18445m(ArrayMap arrayMap, int i10, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Race condition happened, the size of ArrayMap is " + i10 + " but it isn't an `" + str + '`');
        sb2.append('\n');
        StringBuilder sb3 = new StringBuilder("Type: ");
        sb3.append(arrayMap.getClass());
        sb2.append(sb3.toString());
        sb2.append('\n');
        StringBuilder sb4 = new StringBuilder();
        Map<String, Integer> mapAllValuesThreadUnsafeForRendering = mo18424j().allValuesThreadUnsafeForRendering();
        sb4.append("[\n");
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(arrayMap, 10));
        int i11 = 0;
        for (T t10 : arrayMap) {
            int i12 = i11 + 1;
            T t11 = null;
            if (i11 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            for (T t12 : mapAllValuesThreadUnsafeForRendering.entrySet()) {
                if (((Number) ((Map.Entry) t12).getValue()).intValue() == i11) {
                    t11 = t12;
                    break;
                }
            }
            sb4.append("  " + ((Map.Entry) t11) + '[' + i11 + "]: " + t10);
            sb4.append('\n');
            arrayList.add(sb4);
            i11 = i12;
        }
        sb2.append("Content: " + AbstractC9306j0.m9892k(sb4, "]", '\n'));
        sb2.append('\n');
        return sb2.toString();
    }
}
