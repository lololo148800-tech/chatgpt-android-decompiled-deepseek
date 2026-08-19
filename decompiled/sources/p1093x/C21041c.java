package p1093x;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p001A.C0013G0;

/* JADX INFO: renamed from: x.c */
/* JADX INFO: loaded from: classes.dex */
public final class C21041c {

    /* JADX INFO: renamed from: a */
    public final byte[] f66920a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f66921b;

    public C21041c(byte[] bArr, List list) {
        this.f66920a = bArr;
        this.f66921b = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            this.f66921b.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    /* JADX INFO: renamed from: a */
    public static C21041c m21500a(String str, List list) throws IOException {
        Collections.sort(list, new C0013G0(20));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return new C21041c(byteArrayOutputStream.toByteArray(), list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21041c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f66920a, ((C21041c) obj).f66920a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f66920a);
    }
}
