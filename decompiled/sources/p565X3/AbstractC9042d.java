package p565X3;

import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import bb.C11333z;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p084D4.C1918i;
import p1016t3.C19755E;
import p1073w3.AbstractC20800b;
import p138F8.vJO.anhfj;

/* JADX INFO: renamed from: X3.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9042d {

    /* JADX INFO: renamed from: a */
    public static final String[] f27612a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b */
    public static final String[] f27613b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c */
    public static final String[] f27614c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX INFO: renamed from: a */
    public static C1918i m9607a(String str) throws XmlPullParserException, IOException {
        long j10;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!AbstractC20800b.m21329q(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw C19755E.m20712a(null, "Couldn't find xmp metadata");
        }
        C11276A c11276a = AbstractC11278C.f34162Z;
        C11294T c11294tM9608b = C11294T.f34185q0;
        long j11 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (AbstractC20800b.m21329q(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = f27612a;
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    String strM21326n = AbstractC20800b.m21326n(xmlPullParserNewPullParser, strArr[i11]);
                    if (strM21326n != null) {
                        if (Integer.parseInt(strM21326n) != 1) {
                            break loop0;
                        }
                        String[] strArr2 = f27613b;
                        int i12 = 0;
                        while (true) {
                            if (i12 < 4) {
                                String strM21326n2 = AbstractC20800b.m21326n(xmlPullParserNewPullParser, strArr2[i12]);
                                if (strM21326n2 != null) {
                                    j10 = Long.parseLong(strM21326n2);
                                    if (j10 != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i12++;
                            }
                            j10 = -9223372036854775807L;
                            break;
                        }
                        String[] strArr3 = f27614c;
                        while (true) {
                            if (i10 >= 2) {
                                C11276A c11276a2 = AbstractC11278C.f34162Z;
                                c11294tM9608b = C11294T.f34185q0;
                                break;
                            }
                            String strM21326n3 = AbstractC20800b.m21326n(xmlPullParserNewPullParser, strArr3[i10]);
                            if (strM21326n3 != null) {
                                c11294tM9608b = AbstractC11278C.m12696z(new C9040b(0L, 0L, "image/jpeg"), new C9040b(Long.parseLong(strM21326n3), 0L, "video/mp4"));
                                break;
                            }
                            i10++;
                        }
                        j11 = j10;
                    }
                }
                return null;
            }
            if (AbstractC20800b.m21329q(xmlPullParserNewPullParser, "Container:Directory")) {
                c11294tM9608b = m9608b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (AbstractC20800b.m21329q(xmlPullParserNewPullParser, "GContainer:Directory")) {
                c11294tM9608b = m9608b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!AbstractC20800b.m21328p(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (c11294tM9608b.isEmpty()) {
            return null;
        }
        return new C1918i(j11, c11294tM9608b, 3);
    }

    /* JADX INFO: renamed from: b */
    public static C11294T m9608b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        long j10;
        long j11;
        C11333z c11333zM12690s = AbstractC11278C.m12690s();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (AbstractC20800b.m21329q(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(anhfj.hReXeBIOgK);
                String strConcat6 = str2.concat(":Padding");
                String strM21326n = AbstractC20800b.m21326n(xmlPullParser, strConcat3);
                String strM21326n2 = AbstractC20800b.m21326n(xmlPullParser, strConcat4);
                String strM21326n3 = AbstractC20800b.m21326n(xmlPullParser, strConcat5);
                String strM21326n4 = AbstractC20800b.m21326n(xmlPullParser, strConcat6);
                if (strM21326n != null && strM21326n2 != null) {
                    if (strM21326n3 != null) {
                        j10 = Long.parseLong(strM21326n3);
                    } else {
                        j10 = 0;
                    }
                    if (strM21326n4 != null) {
                        j11 = Long.parseLong(strM21326n4);
                    } else {
                        j11 = 0;
                    }
                    c11333zM12690s.m12762a(new C9040b(j10, j11, strM21326n));
                } else {
                    return C11294T.f34185q0;
                }
            }
        } while (!AbstractC20800b.m21328p(xmlPullParser, strConcat2));
        return c11333zM12690s.m12768j();
    }
}
