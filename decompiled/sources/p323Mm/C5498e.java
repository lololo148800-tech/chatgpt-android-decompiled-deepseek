package p323Mm;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Mm.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C5498e implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C5498e f17954Y = new C5498e();

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        String string;
        Map.Entry entry = (Map.Entry) obj;
        AbstractC16544l.m18094g(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            AbstractC16544l.m18093f(string, "toString(...)");
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            AbstractC16544l.m18093f(string, "toString(...)");
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            AbstractC16544l.m18093f(string, "toString(...)");
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            AbstractC16544l.m18093f(string, "toString(...)");
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            AbstractC16544l.m18093f(string, "toString(...)");
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            AbstractC16544l.m18093f(string, "toString(...)");
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            AbstractC16544l.m18093f(string, "toString(...)");
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            AbstractC16544l.m18093f(string, "toString(...)");
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            AbstractC16544l.m18093f(string, "toString(...)");
        } else {
            string = value.toString();
        }
        return str + '=' + string;
    }
}
