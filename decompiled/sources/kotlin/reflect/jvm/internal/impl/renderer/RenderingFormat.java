package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p523V9.AbstractC7877E4;
import p755fn.C13702c;
import p755fn.C13703d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class RenderingFormat {
    public static final RenderingFormat HTML;
    public static final RenderingFormat PLAIN;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ RenderingFormat[] f52844Y;

    static {
        C13703d c13703d = new C13703d("PLAIN", 0, null);
        PLAIN = c13703d;
        C13702c c13702c = new C13702c("HTML", 1, null);
        HTML = c13702c;
        RenderingFormat[] renderingFormatArr = {c13703d, c13702c};
        f52844Y = renderingFormatArr;
        AbstractC7877E4.m8156j(renderingFormatArr);
    }

    public RenderingFormat(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        super(str, i10);
    }

    public static RenderingFormat valueOf(String str) {
        return (RenderingFormat) Enum.valueOf(RenderingFormat.class, str);
    }

    public static RenderingFormat[] values() {
        return (RenderingFormat[]) f52844Y.clone();
    }

    public abstract String escape(String str);
}
