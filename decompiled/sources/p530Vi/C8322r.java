package p530Vi;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: Vi.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C8322r extends IOException {

    /* JADX INFO: renamed from: Y */
    public final int f25946Y;

    /* JADX INFO: renamed from: Z */
    public final Map f25947Z;

    public C8322r(int i10, String str, String str2, Map map) {
        StringBuilder sb2 = new StringBuilder("HTTP ");
        sb2.append(i10);
        sb2.append(": ");
        sb2.append(str);
        sb2.append(". Response: ");
        sb2.append(str2 == null ? "No response" : str2);
        super(sb2.toString());
        this.f25946Y = i10;
        this.f25947Z = map;
    }
}
