package p544W9;

import android.graphics.Rect;
import io.sentry.AbstractC15152P0;
import io.sentry.InterfaceC15154Q;
import io.sentry.instrumentation.file.C15378c;
import io.sentry.util.AbstractC15500e;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import p117Eb.C2391u;
import p279L1.VOxZ.sVoFrD;

/* JADX INFO: renamed from: W9.y3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8746y3 {
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static boolean m9490a(int i10, Rect rect, Rect rect2, Rect rect3) {
        int iM9496g;
        int i11;
        int i12;
        boolean zM9491b = m9491b(i10, rect, rect2);
        if (m9491b(i10, rect, rect3) || !zM9491b) {
            return false;
        }
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i10 != 17 && i10 != 66) {
                            iM9496g = m9496g(i10, rect, rect2);
                            if (i10 != 17) {
                                i11 = rect.left;
                                i12 = rect3.left;
                            } else if (i10 != 33) {
                                i11 = rect.top;
                                i12 = rect3.top;
                            } else if (i10 != 66) {
                                i11 = rect3.right;
                                i12 = rect.right;
                            } else {
                                if (i10 == 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i11 = rect3.bottom;
                                i12 = rect.bottom;
                            }
                            if (iM9496g < Math.max(1, i11 - i12)) {
                                return true;
                            }
                            return false;
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (i10 != 17) {
                        iM9496g = m9496g(i10, rect, rect2);
                        if (i10 != 17) {
                            i11 = rect.left;
                            i12 = rect3.left;
                        } else if (i10 != 33) {
                            i11 = rect.top;
                            i12 = rect3.top;
                        } else if (i10 != 66) {
                            i11 = rect3.right;
                            i12 = rect.right;
                        } else {
                            if (i10 == 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            i11 = rect3.bottom;
                            i12 = rect.bottom;
                        }
                        if (iM9496g < Math.max(1, i11 - i12)) {
                            return true;
                        }
                        return false;
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i10 != 17) {
                    iM9496g = m9496g(i10, rect, rect2);
                    if (i10 != 17) {
                        i11 = rect.left;
                        i12 = rect3.left;
                    } else if (i10 != 33) {
                        i11 = rect.top;
                        i12 = rect3.top;
                    } else if (i10 != 66) {
                        i11 = rect3.right;
                        i12 = rect.right;
                    } else {
                        if (i10 == 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i11 = rect3.bottom;
                        i12 = rect.bottom;
                    }
                    if (iM9496g < Math.max(1, i11 - i12)) {
                        return true;
                    }
                    return false;
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i10 != 17) {
                iM9496g = m9496g(i10, rect, rect2);
                if (i10 != 17) {
                    i11 = rect.left;
                    i12 = rect3.left;
                } else if (i10 != 33) {
                    i11 = rect.top;
                    i12 = rect3.top;
                } else if (i10 != 66) {
                    i11 = rect3.right;
                    i12 = rect.right;
                } else {
                    if (i10 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i11 = rect3.bottom;
                    i12 = rect.bottom;
                }
                if (iM9496g < Math.max(1, i11 - i12)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9491b(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX INFO: renamed from: c */
    public static C15378c m9492c(File file, FileInputStream fileInputStream) {
        return new C15378c(C15378c.m16631a(file, fileInputStream));
    }

    /* JADX INFO: renamed from: d */
    public static C15378c m9493d(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
        InterfaceC15154Q interfaceC15154QMo16256y = AbstractC15500e.f48420a ? AbstractC15152P0.m16331e().mo16256y() : AbstractC15152P0.m16331e().mo16243e();
        return new C15378c(new C2391u((Object) null, interfaceC15154QMo16256y != null ? interfaceC15154QMo16256y.mo16285p("file.read") : null, fileInputStream, AbstractC15152P0.m16331e().mo16246j(), 16), fileDescriptor);
    }

    /* JADX INFO: renamed from: e */
    public static C15378c m9494e(FileInputStream fileInputStream, String str) {
        return new C15378c(C15378c.m16631a(str != null ? new File(str) : null, fileInputStream));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m9495f(int i10, Rect rect, Rect rect2) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        }
        if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        }
        if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            return (i15 < i16 || rect.right <= i16) && rect.right < rect2.right;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        return (i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom;
    }

    /* JADX INFO: renamed from: h */
    public static int m9497h(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX INFO: renamed from: g */
    public static int m9496g(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.right;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.bottom;
        } else if (i10 == 66) {
            i11 = rect2.left;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException(sVoFrD.xDrQsj);
            }
            i11 = rect2.top;
            i12 = rect.bottom;
        }
        return Math.max(0, i11 - i12);
    }
}
