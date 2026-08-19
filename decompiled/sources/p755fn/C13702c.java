package p755fn;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat;
import p1113xn.AbstractC21329w;

/* JADX INFO: renamed from: fn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C13702c extends RenderingFormat {
    @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
    public final String escape(String string) {
        AbstractC16544l.m18094g(string, "string");
        return AbstractC21329w.m21731r(AbstractC21329w.m21731r(string, Separators.LESS_THAN, "&lt;"), Separators.GREATER_THAN, "&gt;");
    }
}
