package p031B3;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import io.sentry.android.core.AbstractC15256t;
import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import p233J4.C4256b;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: B3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0797a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2212Y;

    /* JADX INFO: renamed from: Z */
    public int f2213Z;

    public /* synthetic */ AbstractC0797a() {
        this.f2212Y = 0;
    }

    /* JADX INFO: renamed from: b */
    public static void m1820b(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i10 = 0;
        boolean z6 = false;
        while (i10 <= length) {
            boolean z10 = AbstractC16544l.m18096i(str.charAt(!z6 ? i10 : length), 32) <= 0;
            if (z6) {
                if (!z10) {
                    break;
                } else {
                    length--;
                }
            } else if (z10) {
                i10++;
            } else {
                z6 = true;
            }
        }
        if (str.subSequence(i10, length + 1).toString().length() == 0) {
            return;
        }
        AbstractC15256t.m16482t("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e10) {
            AbstractC15256t.m16483u("SupportSQLite", "delete failed: ", e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m1821c(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    /* JADX INFO: renamed from: m */
    public static int m1822m(int i10) {
        return (i10 >> 24) & 255;
    }

    /* JADX INFO: renamed from: a */
    public void m1823a(int i10) {
        this.f2213Z = i10 | this.f2213Z;
    }

    /* JADX INFO: renamed from: d */
    public boolean m1824d(int i10) {
        return (this.f2213Z & i10) == i10;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo1826g(C4256b c4256b);

    /* JADX INFO: renamed from: i */
    public void mo1827i(C4256b c4256b, int i10, int i11) {
        throw new SQLiteException(AbstractC17792x.m19534q("Can't downgrade database from version ", i10, i11, " to "));
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo1829l(C4256b c4256b, int i10, int i11);

    public String toString() {
        switch (this.f2212Y) {
            case 2:
                return m1821c(this.f2213Z);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ AbstractC0797a(int i10, int i11) {
        this.f2212Y = i11;
        this.f2213Z = i10;
    }

    /* JADX INFO: renamed from: f */
    public void mo1825f(C4256b c4256b) {
    }

    /* JADX INFO: renamed from: j */
    public void mo1828j(C4256b c4256b) {
    }
}
