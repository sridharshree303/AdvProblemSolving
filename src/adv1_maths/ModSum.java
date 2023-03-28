package adv1_maths;

import java.util.Arrays;

public class ModSum {
	public static void main(String[] args) {
		int[] a = { 16, 716, 437, 57, 601, 84, 836, 484, 370, 295, 5, 937, 630, 802, 22, 374, 11, 107, 569, 911, 571, 357, 63, 444, 360, 538, 456, 20, 14, 306, 10, 7, 53, 801, 961, 4, 397, 808, 3, 15, 16, 927, 153, 893, 368, 903, 14, 252, 234, 767, 466, 186, 21, 734, 574, 867, 302, 481, 10, 166, 16, 488, 2, 14, 5, 342, 652, 10, 12, 12, 950, 518, 906, 765, 612, 563, 672, 270, 919, 391, 216, 547, 311, 13, 376, 373, 654, 17, 763, 130, 584, 187, 17, 10, 143, 738, 848, 107, 370, 112, 14, 7, 436, 278, 642, 4, 25, 72, 7, 19, 557, 813, 235, 148, 905, 723, 847, 69, 865, 652, 961, 22, 17, 643, 6, 152, 22, 582, 117, 130, 714, 871, 280, 720, 17, 20, 237, 10, 499, 714, 826, 12, 16, 72, 293, 409, 773, 20, 491, 950, 11, 605, 514, 287, 971, 11, 5, 330, 518, 260, 847, 410, 177, 735, 496, 814, 47, 490, 14, 622, 1000, 21, 507, 989, 868, 12, 672, 203, 109, 646, 13, 14, 857, 15, 900, 105, 396, 782, 14, 4, 15, 501, 529, 743, 561, 6, 7, 979, 19, 308, 990, 391, 4, 10, 940, 15, 18, 295, 22, 943, 518, 8, 12, 16, 14, 318, 588, 714, 13, 11, 785, 528, 884, 856, 603, 968, 106, 882, 811, 288, 976, 7, 135, 561, 682, 339, 615, 18, 355, 540, 9, 691, 11, 67, 18, 355, 984, 446, 20, 379, 784, 285, 388, 425, 945, 7, 265, 544, 16, 125, 21, 243, 319, 316, 10, 5, 764, 460, 540, 100, 983, 18, 913, 14, 625, 811, 20, 444, 855, 22, 108, 174, 416, 526, 316, 130, 8, 12, 244, 17, 795, 319, 337, 12, 17, 323, 21, 932, 692, 345, 12, 770, 654, 662, 544, 11, 898, 4, 6, 13, 709, 60, 381, 191, 428, 358, 682, 517, 479, 57, 250, 129, 368, 13, 361, 390, 941, 13, 913, 923, 304, 824, 5, 16, 9, 7, 316, 305, 12, 373, 705, 333, 20, 6, 231, 14, 756, 925, 243, 673, 312, 901, 639, 16, 528, 955, 8, 7, 115, 589, 730, 676, 404, 415, 22, 10, 662, 14, 433, 786, 850, 17, 734, 4, 17, 618, 467, 18, 123, 211, 8, 878, 482, 579, 834, 185, 204, 587, 292, 766, 52, 937, 793, 700, 867, 336, 16, 581, 910, 321, 318, 19, 14, 216, 36, 543, 344, 8, 537, 390, 218, 858, 361, 916, 330, 170, 9, 111, 661, 476, 307, 373, 281, 663, 656, 761, 301, 902, 11, 15, 461, 482, 718, 787, 596, 17, 16, 750, 5, 475, 896, 567, 62, 797, 858, 103, 889, 767, 823, 538, 13, 8, 934, 18, 656, 927, 8, 925, 22, 9, 334, 911, 70, 154, 18, 13, 940, 674, 121, 12, 13, 954, 632, 11, 907, 843, 18, 139, 778, 799, 15, 380, 696, 353, 541, 291, 207, 10, 690, 22, 14, 831, 226, 559, 11, 12, 11, 792, 10, 185, 10, 530, 15, 506, 399, 653, 186, 796, 263, 8, 811, 623, 750, 443, 702, 891, 469, 16, 18, 340, 588, 520, 47, 326, 645, 15, 923, 708, 9, 541, 13, 512, 396, 851, 122, 12, 17, 187, 335, 470, 395, 766, 9, 711, 16, 936, 354, 728, 113, 69, 378, 248, 796, 17, 239, 18, 10, 235, 57, 13, 948, 246, 10, 430, 657, 611, 745, 894, 14, 14, 12, 582, 707, 10, 392, 898, 600, 925, 416, 23, 566, 685, 882, 320, 2, 436, 18, 929, 358, 366, 785, 910, 407, 610, 373, 131, 487, 15, 19, 394, 435, 144, 974, 764, 640, 410, 260, 741, 895, 853, 272, 836, 641, 655, 127, 952, 747, 941, 581, 8, 8, 27, 10, 14, 896, 869, 971, 520, 585, 154, 196, 807, 971, 21, 474, 235, 430, 551, 18, 232, 9, 812, 517, 969, 19, 863, 761, 767, 542, 866, 34, 968, 633, 728, 666, 11, 104, 565, 10, 428, 163, 209, 830, 44, 194, 897, 961, 861, 622, 775, 776, 924, 16, 634, 68, 8, 680, 328, 938, 183, 184, 733, 460, 597, 16, 696, 12, 836, 580, 11, 20, 232, 633, 915, 755, 720, 15, 15, 16, 12, 843, 445, 15, 737, 535, 827, 25, 11, 847, 548, 16, 7, 1, 16, 317, 794, 338, 928, 973, 623, 464, 76, 200, 476, 11, 14, 636, 846, 490, 299, 119, 549, 399, 47, 406, 919, 642, 642, 227, 399, 692, 639, 15, 196, 15, 604, 782, 120, 77, 259, 529, 709, 20, 20, 650, 14, 15, 19, 373, 644, 404, 297, 346, 840, 11, 192, 848, 72, 284, 413, 392, 874, 16, 17, 467, 16, 17, 864, 10, 13, 16, 730, 9, 22, 744, 497, 733, 21, 446, 12, 29, 94, 179, 10, 251, 7, 731, 430, 10, 844, 859, 12, 225, 792, 90, 460, 312, 490, 146, 309, 761, 286, 9, 841, 785, 12, 331, 597, 47, 1, 44, 400, 17, 247, 7, 14, 270, 138, 159, 500, 270, 231, 10, 194, 18, 19, 12, 238, 13, 680, 365, 9, 908, 833, 11, 682, 480, 846, 14, 695, 364, 603, 83, 8, 966, 37, 173, 91, 300, 251, 23, 796, 254, 757, 16, 16, 92, 11, 501, 209, 16, 851, 273, 3, 39, 179, 15, 713, 109, 590, 623, 19, 390, 751, 897, 557, 71, 59, 18, 657, 555, 16, 74, 123, 984, 19, 380, 244, 17, 453, 293, 966, 170, 694, 645, 770, 469, 15, 13, 13, 435, 527, 78, 237, 587, 150, 6, 16, 77, 450, 256, 535, 664, 80, 19, 686, 592, 18, 783, 201, 250, 68, 27, 267, 786, 896, 572, 512, 17, 16, 10, 546, 681, 255, 564, 234, 585, 663, 864, 908, 901, 8, 10, 7, 471, 16, 455, 312, 959, 7, 14, 89, 198, 19, 11, 15, 11, 816, 468, 18, 342, 45, 170, 11, 800, 188, 686, 147, 10, 10, 73, 81, 506, 12, 98, 76, 820, 468, 992, 796, 442, 714, 411, 36, 6, 681, 15, 33, 16, 761, 6, 135, 579, 253, 437, 257, 948, 640, 15, 808, 803, 503, 645, 338, 624, 24, 203, 969, 11, 11, 975, 979, 161, 300, 8, 189, 214, 242, 7, 9, 282, 917, 771, 4, 627, 15, 553, 344, 689, 17, 17, 57, 762, 205, 883, 682, 13, 391, 937, 333, 630, 306, 9, 11, 14, 648, 809, 858, 336, 764, 898, 958, 797, 418, 874, 403, 15, 731, 9, 11, 23, 729, 459, 16, 527, 409, 211, 13, 538, 115, 208, 326, 984, 927, 48, 329, 341, 992, 2, 864, 83, 12, 504, 624, 643, 811, 15, 16, 365, 9, 41, 15, 500, 8, 886, 18, 463, 5, 12, 914, 566, 891, 16, 13, 489, 11, 834, 784, 249, 748, 8, 850, 311, 46, 822, 451, 15, 10, 735, 202, 11, 166, 14, 494, 105, 505, 859, 903, 259, 446, 674, 4, 21, 605, 8, 385, 365, 7, 187, 16, 16, 123, 907, 74, 354, 178, 552, 761, 119, 926, 20, 596, 119, 18, 936, 343, 13, 618, 21, 254, 98, 12, 680, 209, 101, 745, 528, 8, 971, 244, 719, 902, 542, 761, 688, 991, 709, 9, 18, 831, 12, 692, 297, 12, 812, 143, 12, 579, 688, 12, 514, 60, 28, 512, 551, 69, 20, 355, 659, 198, 19, 824, 15, 208, 8, 791, 306, 906, 336, 15, 686, 14, 142, 16, 823, 753, 929, 559, 969, 286, 5, 19, 116, 927, 33, 902, 478, 14, 611, 61, 925, 809, 186, 203, 10, 794, 383, 779, 568, 905, 17, 214, 7, 458, 344, 5, 20, 861, 149, 10, 790, 597, 354, 170, 310, 332, 299, 850, 377, 205, 799, 764, 773, 13, 645, 21, 9, 350, 591, 952, 111, 450, 993, 16, 442, 722, 733, 490, 508, 11, 77, 638, 333, 5, 315, 313, 80, 103, 312, 619, 408, 614, 11, 520, 10, 836, 135, 329, 797, 13, 22, 965, 530, 6, 632, 577, 21, 15, 216, 945, 795, 848, 950, 654, 13, 15, 727, 447, 55, 59, 957, 175, 882, 336, 773, 911, 107, 183, 158, 409, 18, 558, 906, 938, 182, 961, 10, 15, 511, 273, 924, 450, 185, 941, 619, 15, 10, 210, 9, 316, 21, 704, 817, 297, 904, 405, 125, 444, 559, 845, 305, 899, 556, 8, 813, 794, 552, 15, 994, 16, 337, 523, 749, 4, 47, 8, 82, 20, 374, 664, 631, 628, 975, 906, 19, 5, 825, 6, 289, 440, 666, 708, 205, 13, 23, 158, 762, 7, 6, 925, 7, 2, 7, 460, 11, 3, 420, 926, 387, 872, 412, 757, 386, 10, 700, 17, 243, 836, 7, 474, 241, 682, 3, 721, 866, 17, 392, 550, 898, 777, 578, 845, 770, 969, 9, 15, 11, 907, 345, 914, 680, 586, 5, 240, 25, 8, 12, 336, 11, 14, 632, 401, 404, 560, 372, 924, 554, 514, 260, 13, 305, 7, 715, 495, 499, 7, 278, 12, 631, 535, 858, 476, 24, 737, 18, 393, 560, 548, 828, 19, 356, 230, 5, 675, 83, 460, 8, 578, 588, 5, 995, 11, 549, 119, 4, 62, 8, 253, 913, 803, 585, 748, 174, 983, 19, 240, 391, 902, 5, 632, 973, 402, 251, 760, 237, 274, 705, 20, 929, 9, 16, 873, 246, 107, 61, 304, 810, 371, 29, 12, 650, 10, 621, 46, 17, 89, 17, 779, 142, 465, 52, 502, 950, 8, 126, 713, 15, 892, 522, 770, 500, 11, 367, 610, 601, 9, 21, 433, 355, 765, 983, 241, 743, 7, 658, 963, 334, 931, 684, 547, 18, 409, 501, 893, 93, 923, 618, 13, 762, 657, 21, 653, 813, 130, 629, 262, 114, 991, 769, 643, 988, 87, 597, 23, 12, 936, 5, 19, 827, 627, 440, 130, 694, 712, 865, 678, 520, 129, 5, 959, 282, 53, 177, 16, 234, 922, 14, 338, 533, 20, 837, 577, 827, 869, 532, 287, 383, 527, 941, 16, 999, 339, 812, 204, 190, 15, 13, 16, 991, 17, 11, 877, 16, 578, 447, 48, 768, 784, 813, 613, 520, 15, 14, 485, 309, 185, 831, 409, 687, 198, 230, 981, 799, 845, 21, 126, 564, 8, 739, 854, 13, 338, 129, 744, 270, 690, 401, 5, 801, 100, 348, 962, 275, 362, 120, 17, 15, 464, 677, 18, 450, 13, 178, 844, 724, 149, 544, 959, 9, 871, 15, 140, 159, 19, 596, 263, 559, 618, 891, 11, 25, 16, 634, 77, 736, 531, 15, 50, 15, 241, 11, 12, 311, 559, 402, 140, 15, 834, 496, 588, 363, 8, 545, 425, 816, 140, 926, 557, 97, 846, 517, 357, 206, 488, 799, 791, 827, 12, 908, 665, 516, 920, 20, 895, 425, 831, 140, 906, 907, 16, 6, 633, 3, 15, 481, 18, 789, 17, 607, 5, 659, 511, 19, 865, 15, 936, 242, 978, 221, 842, 98, 97, 599, 803, 711, 9, 19, 787, 10, 472, 59, 481, 98, 534, 17, 237, 14, 826, 888, 810, 14, 14, 924, 218, 613, 4, 704, 784, 966, 594, 6, 327, 5, 478, 15, 22, 542, 287, 250, 9, 248, 555, 849, 16, 629, 531, 20, 499, 726, 13, 414, 455, 274, 418, 680, 702, 173, 859, 247, 273, 9, 17, 173, 8, 954, 12, 16, 438, 854, 14, 813, 7, 581, 331, 344, 341, 837, 167, 713, 14, 596, 264, 8, 332, 16, 630, 518, 22, 842, 921, 17, 10, 12, 9, 18, 12, 602, 269, 73, 10, 325, 20, 14, 771, 518, 13, 152, 435, 212, 109, 246, 8, 772, 18, 687, 279, 668, 575, 14, 535, 527, 15, 206, 86, 9, 336, 464, 976, 84, 156, 738, 736, 123, 399, 314, 443, 448, 17, 952, 990, 363, 640, 633, 579, 719, 86, 377, 370, 15, 730, 412, 959, 10, 15, 11, 15, 577, 726, 9, 492, 980, 13, 463, 294, 264, 404, 110, 18, 290, 907, 704, 824, 25, 809, 16, 17, 550, 778, 216, 611, 953, 167, 855, 19, 16, 106, 123, 116, 20, 933, 533, 831, 427, 195, 806, 105, 523, 12, 48, 15, 532, 178, 917, 190, 108, 10, 13, 948, 990, 21, 800, 103, 436, 12, 8, 705, 801, 117, 871, 392, 622, 944, 507, 15, 245, 263, 869, 52, 131, 6, 334, 6, 326, 940, 451, 333, 17, 23, 631, 996, 137, 321, 885, 323, 20, 795, 53, 559, 47, 149, 355, 296, 175, 576, 9, 978, 614, 11, 21, 270, 11, 20, 370, 729, 534, 448, 4, 632, 806, 864, 853, 11, 265, 128, 107, 779, 13, 837, 9, 15, 255, 528, 16, 269, 14, 16, 901, 47, 6, 493, 80, 690, 737, 538, 992, 10, 9, 545, 605, 196, 807, 55, 16, 757, 15, 7, 105, 17, 921, 121, 869, 476, 795, 772, 469, 806, 697, 8, 569, 99, 581, 634, 89, 865, 587, 6, 742, 485, 344, 139, 365, 244, 899, 602, 797, 734, 167, 21, 209, 16, 531, 13, 775, 629, 938, 704, 88, 247, 23, 858, 530, 509, 39, 797, 8, 871, 969, 97, 199, 776, 796, 13, 16, 6, 221, 416, 360, 320, 757, 861, 680, 30, 249, 680, 16, 12, 649, 69, 807, 6, 319, 422, 861, 126, 10, 267, 407, 404, 676, 707, 16, 20, 17, 836, 215, 12, 221, 429, 342, 166, 15, 118, 18, 962, 593, 12, 15, 8, 13, 156, 280, 325, 13, 287, 22, 404, 706, 16, 110, 620, 676, 21, 169, 14, 891, 425, 800, 614, 9, 12, 141, 522, 880, 919, 87, 936, 18, 857, 166, 847, 85, 327, 9, 209, 706, 788, 3, 913, 11, 974, 756, 87, 9, 10, 41, 934, 18, 228, 449, 960, 877, 12, 434, 891, 18, 74, 930, 437, 18, 411, 810, 504, 11, 16, 9, 963, 559, 200, 13, 170, 195, 204, 847, 410, 928, 76, 343, 17, 984, 199, 227, 24, 808, 347, 120, 415, 216, 43, 741, 480, 213, 952, 575, 917, 79, 10, 257, 370, 402, 672, 775, 18, 324, 384, 844, 713, 27, 14, 742, 251, 67, 357, 3, 878, 16, 711, 16, 993, 519, 482, 789, 579, 278, 193, 213, 275, 983, 808, 480, 6, 10, 482, 973, 965, 20, 68, 213, 10, 17, 562, 632, 10, 17, 936, 453, 713, 23, 197, 68, 746, 731, 29, 352, 827, 7, 189, 6, 359, 215, 506, 11, 17, 17, 389, 9, 3, 887, 8, 149, 568, 342, 12, 13, 11, 303, 907, 18, 765, 17, 123, 308, 905, 6, 766, 11, 505, 290, 379, 11, 401, 15, 763, 179, 937, 20, 103, 880, 359, 966, 5, 660, 8, 560, 13, 249, 346, 162, 260, 11, 756, 7, 538, 816, 455, 474, 780, 155, 97, 12, 14, 969, 492, 10, 424, 22, 19, 10, 554, 759, 995, 682, 145, 18, 966, 976, 865, 803, 864, 45, 865, 15, 16, 6, 96, 40, 16, 251, 8, 111, 7, 976, 30, 784, 372, 481, 659, 382, 97, 9, 102, 856, 793, 70, 5, 909, 389, 15, 906, 85, 18, 61, 607, 19, 11, 7, 5, 195, 182, 639, 15, 373, 12, 132, 10, 589, 259, 930, 14, 20, 8, 197, 290, 10, 510, 93, 569, 292, 820, 195, 18, 952, 252, 853, 22, 408, 411, 605, 747, 11, 515, 814, 634, 865, 381, 12, 434, 290, 20, 12, 17, 897, 14, 92, 390, 327, 544, 852, 9, 623, 998, 925, 578, 15, 17, 86, 231, 239, 876, 500, 40, 66, 511, 8, 432, 218, 734, 498, 447, 305, 10, 14, 665, 786, 494, 511, 456, 299, 193, 130, 14, 211, 454, 17, 5, 5, 51, 8, 12, 272, 444, 296, 17, 792, 778, 659, 244, 579, 13, 735, 13, 277, 702, 824, 790, 163, 765, 19, 820, 745, 558, 11, 972, 877, 369, 17, 927, 739, 11, 923, 418, 15, 654, 758, 5, 280, 9, 549, 290, 271, 876, 867, 21, 821, 688, 725, 826, 17, 15, 413, 49, 94, 708, 65, 200, 19, 564, 797, 10, 414, 90, 143, 12, 584, 508, 454, 580, 632, 18, 168, 140, 259, 658, 128, 522, 779, 140, 372, 113, 9, 5, 31, 205, 18, 21, 887, 17, 37, 626, 93, 440, 496, 93, 609, 915, 14, 952, 18, 17, 741, 564, 9, 229, 423, 12, 245, 583, 810, 837, 952, 19, 14, 983, 397, 260, 8, 609, 7, 666, 628, 71, 678, 72, 39, 6, 353, 865, 606, 238, 872, 8, 236, 491, 415, 194, 7, 822, 220, 28, 15, 852, 676, 180, 15, 17, 21, 9, 12, 11, 69, 15, 931, 856, 9, 10, 14, 290, 533, 6, 18, 164, 116, 970, 252, 885, 16, 8, 504, 692, 699, 316, 12, 17, 975, 49, 42, 9, 915, 116, 470, 19, 17, 390, 14, 545, 427, 16, 249, 510, 19, 638, 584, 507, 17, 774, 1000, 794, 685, 214, 97, 4, 608, 306, 816, 333, 738};
		System.out.println(solve(a));
	}

	//Time complexity - O(n+m)
	//Space complexity - O(m)
	private static int solve(int[] A) {
		long mod = (long) Math.pow(10, 9) + 7;
		int n = A.length;
		
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(max < A[i]) {
				max = A[i];
			}
		}
		
		//System.out.println(max);
		
		// base case
		if (n == 1) {
			return 0;
		}

		// intialise the array with 1000 size
		int arr[] = new int[max+1];

		// loop and assign values
		for (int i = 0; i < n; i++) {
			arr[A[i]]++;
		}
		
		
		// main function
		long sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (i != j && arr[i] != 0 && arr[j] != 0 ) {
					//System.out.println(arr[i]+"--"+arr[j]);
					int m = arr[i] * arr[j];
					int val1 = (i % j) * m;
					int val2 = (j % i) * m;
					sum = (sum + val1)%mod;
					sum = (sum + val2)%mod;
				}
			}
		}
		return (int) (sum % mod);
	}
}
