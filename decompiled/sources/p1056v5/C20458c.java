package p1056v5;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.graphics.Bitmap;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17335b;
import mo.C17336c;
import mo.C17348o;
import mo.C17349p;
import mo.C17358y;
import no.AbstractC17708b;
import p003A1.C0284r0;
import p007A5.AbstractC0371f;
import p007A5.AbstractC0380o;
import p1113xn.AbstractC21329w;
import p791hj.C14522e;
import ro.AbstractC19258b;

/* JADX INFO: renamed from: v5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C20458c {

    /* JADX INFO: renamed from: a */
    public final C17358y f64939a;

    /* JADX INFO: renamed from: b */
    public final C20457b f64940b;

    /* JADX INFO: renamed from: c */
    public final Date f64941c;

    /* JADX INFO: renamed from: d */
    public final String f64942d;

    /* JADX INFO: renamed from: e */
    public final Date f64943e;

    /* JADX INFO: renamed from: f */
    public final String f64944f;

    /* JADX INFO: renamed from: g */
    public final Date f64945g;

    /* JADX INFO: renamed from: h */
    public final long f64946h;

    /* JADX INFO: renamed from: i */
    public final long f64947i;

    /* JADX INFO: renamed from: j */
    public final String f64948j;

    /* JADX INFO: renamed from: k */
    public final int f64949k;

    public C20458c(C17358y c17358y, C20457b c20457b) {
        int i10;
        this.f64939a = c17358y;
        this.f64940b = c20457b;
        this.f64949k = -1;
        if (c20457b != null) {
            this.f64946h = c20457b.f64935c;
            this.f64947i = c20457b.f64936d;
            C17348o c17348o = c20457b.f64938f;
            int size = c17348o.size();
            for (int i11 = 0; i11 < size; i11++) {
                String strM19014m = c17348o.m19014m(i11);
                if (AbstractC21329w.m21726m(strM19014m, SIPHeaderNames.DATE)) {
                    String strM19012f = c17348o.m19012f(SIPHeaderNames.DATE);
                    Date date = null;
                    if (strM19012f != null) {
                        C0284r0 c0284r0 = AbstractC19258b.f61050a;
                        if (strM19012f.length() != 0) {
                            ParsePosition parsePosition = new ParsePosition(0);
                            Date date2 = ((DateFormat) AbstractC19258b.f61050a.get()).parse(strM19012f, parsePosition);
                            if (parsePosition.getIndex() == strM19012f.length()) {
                                date = date2;
                            } else {
                                String[] strArr = AbstractC19258b.f61051b;
                                synchronized (strArr) {
                                    try {
                                        int length = strArr.length;
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 >= length) {
                                                break;
                                            }
                                            DateFormat[] dateFormatArr = AbstractC19258b.f61052c;
                                            DateFormat simpleDateFormat = dateFormatArr[i12];
                                            if (simpleDateFormat == null) {
                                                simpleDateFormat = new SimpleDateFormat(AbstractC19258b.f61051b[i12], Locale.US);
                                                simpleDateFormat.setTimeZone(AbstractC17708b.f56540e);
                                                dateFormatArr[i12] = simpleDateFormat;
                                            }
                                            parsePosition.setIndex(0);
                                            Date date3 = simpleDateFormat.parse(strM19012f, parsePosition);
                                            if (parsePosition.getIndex() != 0) {
                                                date = date3;
                                                break;
                                            }
                                            i12++;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                        }
                    }
                    this.f64941c = date;
                    this.f64942d = c17348o.m19018s(i11);
                } else if (AbstractC21329w.m21726m(strM19014m, SIPHeaderNames.EXPIRES)) {
                    this.f64945g = c17348o.m19013j(SIPHeaderNames.EXPIRES);
                } else if (AbstractC21329w.m21726m(strM19014m, "Last-Modified")) {
                    this.f64943e = c17348o.m19013j("Last-Modified");
                    this.f64944f = c17348o.m19018s(i11);
                } else if (AbstractC21329w.m21726m(strM19014m, "ETag")) {
                    this.f64948j = c17348o.m19018s(i11);
                } else if (AbstractC21329w.m21726m(strM19014m, "Age")) {
                    String strM19018s = c17348o.m19018s(i11);
                    Bitmap.Config config = AbstractC0371f.f1262a;
                    Long lM21738y = AbstractC21329w.m21738y(strM19018s);
                    if (lM21738y != null) {
                        long jLongValue = lM21738y.longValue();
                        i10 = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                    } else {
                        i10 = -1;
                    }
                    this.f64949k = i10;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:60:0x010e  */
    /* JADX WARN: Code duplicated, block: B:63:0x011d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0125  */
    /* JADX WARN: Code duplicated, block: B:70:0x0139  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Code duplicated, block: B:80:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x015a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0164  */
    /* JADX WARN: Code duplicated, block: B:87:0x017b  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, mm.i] */
    /* JADX INFO: renamed from: a */
    public final C20459d m21109a() {
        long j10;
        long jMin;
        String string;
        long time;
        int i10;
        int i11;
        long millis;
        long millis2;
        String str;
        String str2;
        int i12;
        C17358y c17358y = this.f64939a;
        C20457b c20457b = this.f64940b;
        if (c20457b == null) {
            return new C20459d(c17358y, null);
        }
        C17349p c17349p = c17358y.f55379a;
        if (c17349p.f55295j && !c20457b.f64937e) {
            return new C20459d(c17358y, null);
        }
        ?? r6 = c20457b.f64933a;
        C17336c c17336c = (C17336c) r6.getValue();
        if (c17358y.m19037a().f55217b || ((C17336c) r6.getValue()).f55217b || AbstractC16544l.m18089b(c20457b.f64938f.m19012f("Vary"), Separators.STAR)) {
            return new C20459d(c17358y, null);
        }
        C17336c c17336cM19037a = c17358y.m19037a();
        if (!c17336cM19037a.f55216a) {
            C17348o c17348o = c17358y.f55381c;
            if (c17348o.m19012f("If-Modified-Since") == null && c17348o.m19012f("If-None-Match") == null) {
                long time2 = this.f64947i;
                Date date = this.f64941c;
                long jMax = date != null ? Math.max(0L, time2 - date.getTime()) : 0L;
                int i13 = this.f64949k;
                if (i13 != -1) {
                    jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i13));
                }
                long time3 = this.f64946h;
                long jLongValue = jMax + (time2 - time3) + (((Number) AbstractC0380o.f1287a.invoke()).longValue() - time2);
                int i14 = ((C17336c) r6.getValue()).f55218c;
                Date date2 = this.f64943e;
                if (i14 == -1) {
                    Date date3 = this.f64945g;
                    if (date3 != null) {
                        if (date != null) {
                            time2 = date.getTime();
                        }
                        time = date3.getTime() - time2;
                        if (time <= 0) {
                            time = 0;
                        }
                    } else if (date2 == null) {
                        j10 = 0;
                        jMin = j10;
                    } else {
                        ArrayList arrayList = c17349p.f55292g;
                        if (arrayList == null) {
                            string = null;
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            C17335b.m18998h(arrayList, sb2);
                            string = sb2.toString();
                        }
                        if (string == null) {
                            if (date != null) {
                                time3 = date.getTime();
                            }
                            long time4 = time3 - date2.getTime();
                            j10 = 0;
                            if (time4 > 0) {
                                jMin = time4 / ((long) 10);
                            }
                        } else {
                            j10 = 0;
                        }
                        jMin = j10;
                    }
                    i10 = c17336cM19037a.f55218c;
                    if (i10 != -1) {
                        jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(i10));
                    }
                    i11 = c17336cM19037a.f55224i;
                    if (i11 != -1) {
                        millis = TimeUnit.SECONDS.toMillis(i11);
                    } else {
                        millis = 0;
                    }
                    if (!c17336c.f55222g || (i12 = c17336cM19037a.f55223h) == -1) {
                        millis2 = 0;
                    } else {
                        millis2 = TimeUnit.SECONDS.toMillis(i12);
                    }
                    if (c17336c.f55216a && jLongValue + millis < jMin + millis2) {
                        return new C20459d(null, c20457b);
                    }
                    str = this.f64948j;
                    if (str != null) {
                        str2 = "If-None-Match";
                    } else {
                        if (date2 != null) {
                            str = this.f64944f;
                            AbstractC16544l.m18091d(str);
                        } else {
                            if (date != null) {
                                return new C20459d(c17358y, null);
                            }
                            str = this.f64942d;
                            AbstractC16544l.m18091d(str);
                        }
                        str2 = "If-Modified-Since";
                    }
                    C14522e c14522eM19038b = c17358y.m19038b();
                    c14522eM19038b.m16012b(str2, str);
                    return new C20459d(c14522eM19038b.m16017i(), c20457b);
                }
                time = TimeUnit.SECONDS.toMillis(i14);
                jMin = time;
                i10 = c17336cM19037a.f55218c;
                if (i10 != -1) {
                    jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(i10));
                }
                i11 = c17336cM19037a.f55224i;
                if (i11 != -1) {
                    millis = TimeUnit.SECONDS.toMillis(i11);
                } else {
                    millis = 0;
                }
                if (c17336c.f55222g) {
                    millis2 = 0;
                } else {
                    millis2 = 0;
                }
                if (c17336c.f55216a) {
                }
                str = this.f64948j;
                if (str != null) {
                    str2 = "If-None-Match";
                } else {
                    if (date2 != null) {
                        str = this.f64944f;
                        AbstractC16544l.m18091d(str);
                    } else {
                        if (date != null) {
                            return new C20459d(c17358y, null);
                        }
                        str = this.f64942d;
                        AbstractC16544l.m18091d(str);
                    }
                    str2 = "If-Modified-Since";
                }
                C14522e c14522eM19038b2 = c17358y.m19038b();
                c14522eM19038b2.m16012b(str2, str);
                return new C20459d(c14522eM19038b2.m16017i(), c20457b);
            }
        }
        return new C20459d(c17358y, null);
    }
}
