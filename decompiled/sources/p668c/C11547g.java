package p668c;

import android.gov.nist.core.Separators;

/* JADX INFO: renamed from: c.g */
/* JADX INFO: loaded from: classes.dex */
public class C11547g extends Exception {
    public C11547g(String str, ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        super(arrayIndexOutOfBoundsException.getMessage() + Separators.SEMICOLON + str);
    }
}
