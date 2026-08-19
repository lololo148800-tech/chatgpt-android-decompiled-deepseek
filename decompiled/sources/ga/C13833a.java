package ga;

import kotlin.jvm.internal.AbstractC16544l;
import p132F2.AbstractC2645i;
import p523V9.AbstractC8136l6;
import p909nm.C17691y;

/* JADX INFO: renamed from: ga.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13833a extends AbstractC2645i {

    /* JADX INFO: renamed from: d */
    public final String f43867d;

    /* JADX INFO: renamed from: e */
    public final String f43868e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13833a(String serverClientId, String str) {
        super(AbstractC8136l6.m8665f(serverClientId, str), AbstractC8136l6.m8665f(serverClientId, str), false, C17691y.f56482Y, 500);
        AbstractC16544l.m18094g(serverClientId, "serverClientId");
        this.f43867d = serverClientId;
        this.f43868e = str;
        if (serverClientId.length() <= 0) {
            throw new IllegalArgumentException("serverClientId should not be empty");
        }
    }
}
